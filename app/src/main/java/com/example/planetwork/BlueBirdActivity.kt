package com.example.planetwork

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_bluebird.*
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_main.*

class BlueBirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bluebird)

        btn_home.setOnClickListener {

            val intent_home = Intent(applicationContext,MainActivity::class.java)
            startActivity(intent_home)
        }

        btn_writeletter.setOnClickListener {

            val intent_writeletter = Intent(applicationContext,SettingActivity::class.java)
            startActivity(intent_writeletter)
        }
    }
    }
}