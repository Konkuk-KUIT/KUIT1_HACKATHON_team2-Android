package com.example.hackatonkuit.retrofit2

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface RetrofitInterface {


    @GET("/app/category")
    fun requestCategories(
    ): Call<List<Category>>




//    fun requestFriendsData(): Call<FriendsData>
//
//    @POST("/friendship")
//    fun addFriend(
//        @Body email: FriendEmailData
//    ): Call<AddFriend>

}