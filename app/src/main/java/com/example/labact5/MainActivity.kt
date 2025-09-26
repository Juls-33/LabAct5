package com.example.labact5

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val fullNameInp: EditText = findViewById(R.id.editTxtFullNameJASS)
        val emailInp: EditText = findViewById(R.id.editTxtEmailJASS)
        val phoneInp: EditText = findViewById(R.id.editTxtPhoneJASS)
        val passwordInp: EditText = findViewById(R.id.editTxtPasswordJASS)
        val btnSignUpInp: Button = findViewById(R.id.btnSignUpJASS)

        val fullName = fullNameInp.text
        val email = emailInp.text
        val phone = phoneInp.text
        val password = passwordInp.text

        btnSignUpInp.setOnClickListener {
            val newIntent = Intent(this, LandingPage::class.java)
            newIntent.putExtra("fullName", fullName.toString())
            newIntent.putExtra("email", email.toString())
            newIntent.putExtra("phone", phone.toString())
            newIntent.putExtra("password", password.toString())

            startActivity(newIntent)
        }

    }
}