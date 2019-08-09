package com.example.planetwork

import android.content.Intent
import android.graphics.Paint
import android.os.Bundle
import android.text.Html
import android.text.SpannableString
import android.text.style.UnderlineSpan
import androidx.appcompat.app.AppCompatActivity
import com.likelion.planetwork.RegisterActivity
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_login.view.*
import java.util.*


var userid = 0
var user_name = ""

class LoginActivity : AppCompatActivity() {
    var category=CharCategory
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        tvGotoRegister.setText(Html.fromHtml(resources.getString(R.string.string_under)))

        tvGotoRegister.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
            finish()
        }

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
