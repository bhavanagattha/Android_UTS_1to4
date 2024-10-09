package com.example.utsandroid

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.utsandroid.databinding.ProfileLinearBinding

class SecondActivity : AppCompatActivity() {
    private val binding by lazy { ProfileLinearBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        with(binding) {
            val name = intent.getStringExtra("EXTRA_NAME")
            nameTxt.text = name

            exitBtn.setOnClickListener {
                val intentToThirdActivity =
                    Intent(this@SecondActivity, ThirdActivity::class.java)

                startActivity(intentToThirdActivity)
            }
        }
    }
}