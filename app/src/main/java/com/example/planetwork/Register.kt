package com.example.planetwork

import retrofit2.Call
import retrofit2.http.*
import retrofit2.http.Body

//회원가입을 위한 data class 작성
data class Register(

    var pk:Int?=null, //회원정보를 불러오기 위한 primary key값.
    var email:String?=null,
    var username:String?=null,
    var password1:String?=null,
    var password2:String?=null,
    var name:String?=null,
    var nickname:String?=null,
    var gender:String?=null,
    var birth_date:String?=null
)

data class Body (
    var username: String?=null,
    var pk: Int?=null
)
data class LoginForm (
    var user: Body
)


