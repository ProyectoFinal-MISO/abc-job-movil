package com.example.abc_job_movil.ui.technicalUser

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.example.abc_job_movil.R
import com.example.abc_job_movil.ui.LoginActivity

class RegisterTechnicalAcademicDataActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_technical_academic_data)

        val back: ImageView = findViewById(R.id.backSkills2)
        back.setOnClickListener{
            val intent = Intent(this, RegisterTechnicalSkillsActivity::class.java)
            startActivity(intent)
        }

        val saveTechnicalData: Button = findViewById(R.id.saveSignInTechnical2)
        saveTechnicalData.setOnClickListener{
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

    }
}