package com.example.abc_job_movil.ui.technicalUser

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.example.abc_job_movil.R
import com.example.abc_job_movil.ui.MainActivity
import com.example.abc_job_movil.ui.RegisterHomeActivity
import com.example.abc_job_movil.ui.abcUser.RegisterABCActivity

class RegisterTechnicalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_technical_register)

        val back: ImageView = findViewById(R.id.backSignIn)
        back.setOnClickListener{
            val intent = Intent(this, RegisterHomeActivity::class.java)
            startActivity(intent)
        }

        val signIn: Button = findViewById(R.id.continueSignIn)
        signIn.setOnClickListener{
            val intent = Intent(this, RegisterTechnicalDataActivity::class.java)
            startActivity(intent)
        }

    }
}