package com.example.abc_job_movil.ui.abcUser

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.example.abc_job_movil.R
import com.example.abc_job_movil.ui.LoginActivity
import com.example.abc_job_movil.ui.RegisterHomeActivity

class RegisterABCActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_abcactivity)

        val back: ImageView = findViewById(R.id.backSignInABC)
        back.setOnClickListener{
            val intent = Intent(this, RegisterHomeActivity::class.java)
            startActivity(intent)
        }

        val saveABCData: Button = findViewById(R.id.SaveSignInABC)
        saveABCData.setOnClickListener{
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

    }
}