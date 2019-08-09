package com.example.planetwork

import android.app.Activity
import android.util.Log
import org.jetbrains.anko.toast
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory

class ConnectServer(var activity: Activity) {
    val retrofit = Retrofit.Builder()
        .baseUrl("https://shrouded-thicket-52351.herokuapp.com")
        .addConverterFactory(ScalarsConverterFactory.create())
        .addConverterFactory(GsonConverterFactory.create())

        .build()

    var server = retrofit.create(ClientService::class.java)

    fun Login(username: String, password: String) {
        server.LoginRequest(username, password)
            .enqueue(object : Callback<Register> {
                override fun onFailure(call: Call<Register>, t: Throwable) {
                    Log.e("서버와 통신에 실패했습니다.", "Error!")
                    activity.toast("인터넷이 없습니다.")
                }

                override fun onResponse(call: Call<Register>, response: Response<Register>) {
                    Log.i("응답성공", "성공!")
                    Log.i("응답코드", response.code().toString())
//                    if (response.code() == 200) {
//                        activity.toast("로그인에 성공했습니다.")
////                        //로그인했을때 user Body 내부 username의 고유 id값을 userid에 저장.
//                        getPK(userid)
//                   }
////                    Log.i("id", "$userid")
//                    //Log.i("바디",response.body().toString())
//                    Log.i("회원 아이디", userid)
                    Log.i("바디", response.body().toString())
                    //activity.finish()
                }
            })
    }

//    fun getPK(pk : Int) {
//        server.getUserRequest(pk).enqueue(object : Callback<Register> {
//            override fun onFailure(call: Call<Register>, t: Throwable) {
//                Log.e("서버와 통신에 실패했습니다.", "Error!")
//                activity.toast("인터넷이 없습니다.")
//            }
//
//            override fun onResponse(call: Call<Register>, response: Response<Register>) {
//                if (response.code() == 200) {
//                    user_name = response.body()?.username!!.toString()
//                    //userid에 따른 user Body 내부 username값을 username에 저장.
//                }
//                val body = response.body()?.toString()
//                Log.i("error", "$body")
//            }
//        })
//    }
}