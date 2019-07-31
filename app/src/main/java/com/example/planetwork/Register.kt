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

interface ClientService {
    //회원가입 서비스
    @FormUrlEncoded
    @POST("/user/register/")
    //BaseUrl 뒤에 들어가는 register 기능 페이지

    fun RegisterRequest(@Field("email")email: String,
                        @Field("username")username: String,
                        @Field("password1")password1: String,
                        @Field("password2")password2: String,
                        @Field("name")name: String,
                        @Field("nickname")nickname: String,
                        @Field("gender")gender: String,
                        @Field("birth_date")birth_date: String):Call<Register>

    //로그인 서비스
    @FormUrlEncoded
    @POST("/user/login/")
    fun LoginRequest(@Field("username")username: String,
                     @Field("password")password1: String):Call<LoginForm>

    //회원정보 받아오기
    @GET("/user/<int:pk>")
    fun UserInfo(@Path("pk")pk:Int):Call<Register>

}


