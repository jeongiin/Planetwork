package com.example.planetwork


import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_writeletter.*

class WriteLetterActivity : AppCompatActivity() {

    var count=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_writeletter)
        ​
        submit_letter.setOnClickListener {
            val intent = Intent(applicationContext,MainActivity::class.java)
            count++
            startActivity(intent)
            finish()
        }

    }

}