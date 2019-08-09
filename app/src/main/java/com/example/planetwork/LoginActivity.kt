package com.example.planetwork

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_login.*


var userid = 0
var user_name = ""

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        Submit2.setOnClickListener {
            var username = input_username.text.toString()
            var password = input_password.text.toString()

            ConnectServer(this).Login(username,password)
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("username", username)
            //404면 액티비티 안넘어가게 만들기
            startActivity(intent)
            finish()
        }
    }
}
