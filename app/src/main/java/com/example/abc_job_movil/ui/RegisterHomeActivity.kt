package com.example.abc_job_movil.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.ImageView
import com.example.abc_job_movil.R
import com.example.abc_job_movil.ui.abcUser.HomeABCUserActivity
import com.example.abc_job_movil.ui.abcUser.RegisterABCActivity
import com.example.abc_job_movil.ui.technicalUser.RegisterTechnicalActivity

class RegisterHomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_home)

        val back: ImageView = findViewById(R.id.backToMain)
        back.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val checkBoxTypeABC: CheckBox = findViewById(R.id.abcSelectSign)
        checkBoxTypeABC.setOnClickListener{
            val intent = Intent(this, RegisterABCActivity::class.java)
            startActivity(intent)
        }
        val checkBoxTechnical: CheckBox = findViewById(R.id.technicalSelectSign)
        checkBoxTechnical.setOnClickListener{
            val intent = Intent(this, RegisterTechnicalActivity::class.java)
            startActivity(intent)
        }

    }
}