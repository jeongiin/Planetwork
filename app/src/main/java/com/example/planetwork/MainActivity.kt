package com.example.planetwork

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_setting.setOnClickListener {

            val intent_set = Intent(applicationContext,SettingActivity::class.java)
            startActivity(intent_set)
        }

        btn_post.setOnClickListener {

            val intent_set = Intent(applicationContext,PostActivity::class.java)
            startActivity(intent_set)
        }

        btn_bird.setOnClickListener {

            val intent_set = Intent(applicationContext,BluebirdActivity::class.java)
            startActivity(intent_set)
        }

        btn_setting.setOnClickListener {

            val intent_set = Intent(applicationContext,SettingActivity::class.java)
            startActivity(intent_set)
        }
    }
}
