package com.example.planetwork

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_read_letter.*

class ReadLetterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_read_letter)

        btnResend.setOnClickListener{
            val intent = Intent(this, WriteLetterActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
