package com.example.planetwork

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        bt_login.setOnClickListener {
            // 에딧텍스트에 입력한 데이터 얻기
            et_id.clearComposingText()
            et_pw.clearComposingText()

            val intent_main = Intent(applicationContext,MainActivity::class.java)
            var idtext = et_id.text.toString()       //input은 바뀔 수 있으니 변경 가능한 var로 선언
            var pwtext = et_pw.text.toString()       //input은 바뀔 수 있으니 변경 가능한 var로 선언
            intent_main.putExtra("text",idtext)
            intent_main.putExtra("text",pwtext)

            // 인텐트로 메인액티비티로 액티비티 전환
            startActivity(intent_main)
        }
    }
}