package com.example.utsandroid

import android.content.Intent
import android.os.Bundle
import android.provider.ContactsContract.Profile
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.utsandroid.databinding.LoginConstraintBinding
import com.example.utsandroid.databinding.ProfileLinearBinding
import com.example.utsandroid.databinding.WelcomeRelativeBinding

class ThirdActivity : AppCompatActivity() {
    private val binding by lazy { LoginConstraintBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        Toast.makeText(this, "You have succesfully logged out", Toast.LENGTH_SHORT).show()
    }
}