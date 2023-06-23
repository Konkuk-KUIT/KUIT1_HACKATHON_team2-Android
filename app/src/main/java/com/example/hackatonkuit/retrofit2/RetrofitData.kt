package com.example.hackatonkuit.retrofit2

import android.media.Image
import com.google.gson.annotations.SerializedName

data class Category(
    @SerializedName("id") val id: Long,
    @SerializedName("image") val image: String,
    @SerializedName("name") val name: String,
    @SerializedName("eng_name") val eng_name: String
)

data class MenuPreview(
    @SerializedName("menuId") val menuId: Long,
    @SerializedName("image") val image: String,
    @SerializedName("name") val name: String,
    @SerializedName("eng_name") val eng_name: String,
    @SerializedName("price") val price: Int,
    @SerializedName("menuStatus") val menuStatus: String
)

data class Menu(
    @SerializedName("menuId") val menuId: Long,
    @SerializedName("image") val image: String,
    @SerializedName("name") val name: String,
    @SerializedName("eng_name") val eng_name: String,
    @SerializedName("description") val description: String,
    @SerializedName("price") val price: Int,
    @SerializedName("menuStatus") val menuStatus: String
)

data class NewMenu(
    @SerializedName("menuId") val menuId: Long,
    @SerializedName("image") val image: String,
    @SerializedName("name") val name: String
)