package com.example.abc_job_movil.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import com.android.volley.Response
import com.example.abc_job_movil.R
import com.example.abc_job_movil.network.NetworkServiceAdapter
import org.json.JSONObject

class LoginActivity : AppCompatActivity() {

    lateinit var networkAdapter: NetworkServiceAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        networkAdapter = NetworkServiceAdapter(this.applicationContext)

        val back: ImageView = findViewById(R.id.back)
        back.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val showLogin: TextView = findViewById(R.id.showLogin)
        val checkBoxTypeABC: CheckBox = findViewById(R.id.ABCUser)
        val checkBoxTechnical: CheckBox = findViewById(R.id.technicalResource)

        checkBoxTypeABC.setOnCheckedChangeListener { _, isChecked ->
            checkBoxTechnical.isEnabled = !isChecked
        }

        checkBoxTechnical.setOnCheckedChangeListener { _, isChecked ->
            checkBoxTypeABC.isEnabled = !isChecked
        }

        val login: Button = findViewById(R.id.login)
        login.setOnClickListener{
            val email: EditText = findViewById(R.id.email)
            val password: EditText = findViewById(R.id.password)
            var userType: String = "DEFAULT"

            if (checkBoxTypeABC.isChecked) {
                userType = "EMPLOYEE"
            } else if (checkBoxTechnical.isChecked) {
                userType = "PERSON"
            }

            val postParams = mapOf<String, Any>(
                "username" to email.text.toString(),
                "password" to password.text.toString(),
                "userType" to userType
            )
            networkAdapter.instance.add(NetworkServiceAdapter.postRequest(
                "users/auth",
                JSONObject(postParams),
                Response.Listener<JSONObject>{response ->
                    showLogin.text = "${response.toString()}"
                },
                Response.ErrorListener { response ->
                    showLogin.text = "${response.toString()}"
                }))
            val intent = Intent(this, HomeTechnicalResourceActivity::class.java)
            startActivity(intent)

        }

    }
}