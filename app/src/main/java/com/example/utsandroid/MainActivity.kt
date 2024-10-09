package com.example.utsandroid

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.utsandroid.databinding.WelcomeRelativeBinding

class MainActivity : AppCompatActivity() {
private val binding by lazy { WelcomeRelativeBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        with(binding) {
            submitBtn.setOnClickListener {
                val name = nameEdit.text.toString()
                val intentToSecondActivity =
                    Intent(this@MainActivity, SecondActivity::class.java)
                intentToSecondActivity.putExtra("EXTRA_NAME", name)

                if (name == "") {
                    Toast.makeText(this@MainActivity, "Enter your name first", Toast.LENGTH_SHORT)
                        .show()
                } else {
                    startActivity(intentToSecondActivity)
                }
            }
        }
    }
}