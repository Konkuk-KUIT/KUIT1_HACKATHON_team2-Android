package com.example.hackatonkuit.retrofit2

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface RetrofitInterface {

    @GET("/app/category")
    fun requestCategories(
    ): Call<List<Category>>

    @GET("/menus")
    fun requestMenus(
        @Query("menu-status") menustatus: String
    ): Call<NewMenu>



//    fun requestFriendsData(): Call<FriendsData>
//
//    @POST("/friendship")
//    fun addFriend(
//        @Body email: FriendEmailData
//    ): Call<AddFriend>

}