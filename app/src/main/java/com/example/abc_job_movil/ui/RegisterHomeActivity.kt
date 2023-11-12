package com.example.abc_job_movil.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.example.abc_job_movil.R
import com.example.abc_job_movil.ui.abcUser.RegisterABCActivity
import com.example.abc_job_movil.ui.technicalUser.RegisterTechnicalActivity

class RegisterHomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_home)

        val back: ImageView = findViewById(R.id.backRegisterHome)
        back.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val abcRegister: ImageView = findViewById(R.id.abcEmployeeImage)
        back.setOnClickListener{
            val intent = Intent(this, RegisterABCActivity::class.java)
            startActivity(intent)
        }

        val technicalRegister: ImageView = findViewById(R.id.technicalResourceImage)
        back.setOnClickListener{
            val intent = Intent(this, RegisterTechnicalActivity::class.java)
            startActivity(intent)
        }

    }
}