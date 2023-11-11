package com.example.abc_job_movil.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import com.example.abc_job_movil.R

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val back: ImageView = findViewById(R.id.back)
        back.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val email: EditText = findViewById(R.id.email)
        val password: EditText = findViewById(R.id.password)

        val login: Button = findViewById(R.id.login)
        back.setOnClickListener{
            val intent = Intent(this, HomeTechnicalResourceActivity::class.java)
            startActivity(intent)
        }


    }


}