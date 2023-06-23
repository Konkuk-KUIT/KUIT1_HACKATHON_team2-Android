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

    @GET("/menus/category/{category_id}")
    fun requestMenuList(
        @Path("category_id") category_id: Long
    ): Call<List<MenuPreview>>

    @GET("menus/{menu_id}")
    fun requestMenu(
        @Path("menu_id") menu_id: Long
    ): Call<List<Menu>>





//    fun requestFriendsData(): Call<FriendsData>
//
//    @POST("/friendship")
//    fun addFriend(
//        @Body email: FriendEmailData
//    ): Call<AddFriend>

}