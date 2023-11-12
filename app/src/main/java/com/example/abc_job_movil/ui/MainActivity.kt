package com.example.abc_job_movil.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.abc_job_movil.R
import com.example.abc_job_movil.ui.technicalUser.RegisterTechnicalActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val login: Button = findViewById(R.id.login)
        login.setOnClickListener{
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        val signIn: Button = findViewById(R.id.signIn)
        signIn.setOnClickListener{
            val intent = Intent(this, RegisterHomeActivity::class.java)
            startActivity(intent)
        }

        val config: Button = findViewById(R.id.config)
        config.setOnClickListener{
            val intent = Intent(this, ConfigurationLanguageActivity::class.java)
            startActivity(intent)
        }

    }
}