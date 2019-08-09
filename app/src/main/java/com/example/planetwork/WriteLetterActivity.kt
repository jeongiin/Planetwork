package com.example.planetwork


import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_writeletter.*
import android.preference.PreferenceManager
import android.R.id.edit
import android.util.Log
import com.likelion.planetwork.RegisterActivity
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class WriteLetterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_writeletter)
        //선언 후 에디터로 초기화
        val pref = this.getPreferences(0)
        //데이터 호출 데이터 없으면 0됨
        var count = pref.getInt("count",0)
        Log.e("되냐","$count")

        val retrofit = Retrofit.Builder()
            .baseUrl("https://shrouded-thicket-52351.herokuapp.com")
            //배포한 웹페이지의 BaseUrl
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        //만들었던 인터페이스 기능 create
        var server = retrofit.create(ClientService::class.java)

        //submit 버튼을 누르면 count 증가
            submit_letter.setOnClickListener {
                count++
                server.postMessage(etWriteLetter.text.toString())
                // 에디터로 초기화 후 count값 저장
                val editor = pref.edit()
                editor.putInt("count", count).apply()
                val intent = Intent(this, MainActivity::class.java)
                intent.putExtra("count",count)
                Log.d("카운트_write","$count")
                startActivity(intent)
                //finish()
             }


    }

}

