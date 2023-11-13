package com.example.abc_job_movil.ui.technicalUser

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.example.abc_job_movil.R
import com.example.abc_job_movil.ui.LoginActivity
import com.example.abc_job_movil.ui.RegisterHomeActivity

class RegisterTechnicalSkillsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_technical_skills)

        val back: ImageView = findViewById(R.id.backPersonalData)
        back.setOnClickListener{
            val intent = Intent(this, RegisterTechnicalActivity::class.java)
            startActivity(intent)
        }

        val saveTechnicalData: Button = findViewById(R.id.continueSignIn2)
        saveTechnicalData.setOnClickListener{
            val intent = Intent(this, RegisterTechnicalAcademicDataActivity::class.java)
            startActivity(intent)
        }

    }
}