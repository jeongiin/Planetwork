package com.likelion.planetwork

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.planetwork.*
import kotlinx.android.synthetic.main.activity_register.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.Retrofit



class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val retrofit = Retrofit.Builder()
            .baseUrl("https://shrouded-thicket-52351.herokuapp.com")
            //배포한 웹페이지의 BaseUrl
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        //만들었던 인터페이스 기능 create
        var server = retrofit.create(ClientService::class.java)

        //register 하기위해 값을 모두 입력하고 제출 버튼을 누를 때
        Submit.setOnClickListener {

            //라디오버튼으로 성별 체크
            when (gender.checkedRadioButtonId) {
                R.id.Male ->
                    genderChecked.text = "male"
                R.id.Female ->
                    genderChecked.text = "female"
            }

            server.RegisterRequest(
                emailText.text.toString(),
                username.text.toString(),
                password.text.toString(),
                repassword.text.toString(),
                nameText.text.toString(),
                nickname.text.toString(),
                genderChecked.text.toString(),
                birthday.text.toString()
            ).enqueue(object : Callback<Register> {

                override fun onResponse(call: Call<Register>, response: Response<Register>) {
                    println(response?.body().toString())
                }
                //서버와 통신에 실패했을 때.
                override fun onFailure(call: Call<Register>, t: Throwable) {
                    Log.d("실패",""+call)
                }

            })

            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
