package com.example.labact5

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.*

class LandingPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_landing_page)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val fullNameTV: TextView = findViewById(R.id.fullNameTxtViewJASS)
        val emailTV: TextView = findViewById(R.id.emailTxtViewJASS)
        val phoneTV: TextView = findViewById(R.id.phoneTxtViewJASS)
        val passwordTV: TextView = findViewById(R.id.passwordTxtViewJASS)
        val welcomeTV: TextView = findViewById(R.id.welcomeTextViewJASS)

        val fullName = intent.getStringExtra("fullName")
        val email = intent.getStringExtra("email")
        val phone = intent.getStringExtra("phone")
        val password = intent.getStringExtra("password")

        welcomeTV.text = "Welcome to Green Haven Shop Mr. " + fullName
        welcomeTV.textSize = 18f
        fullNameTV.text = "Full Name: " + fullName
        emailTV.text = "Email: " + email
        phoneTV.text = "Phone Number: " + phone
        passwordTV.text = "Password: " + password

        val btnReturn: Button = findViewById(R.id.btnReturnJASS)
        btnReturn.setOnClickListener {
            val newIntent = Intent(this, MainActivity::class.java)
            startActivity(newIntent)
        }

    }
}