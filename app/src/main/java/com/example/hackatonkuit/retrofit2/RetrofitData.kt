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

data class CartItem(
    @SerializedName("id") val id: Long,
    @SerializedName("temp") val temp: String,
    @SerializedName("size") val size: String,
    @SerializedName("cup") val cup: String,
    @SerializedName("count") val count: Int,
    @SerializedName("price") val price: Int,
    @SerializedName("menuImage") val menuImage: String,
    @SerializedName("menuName") val menuName: String,
    @SerializedName("menuEngName") val menuEngName: String,
    @SerializedName("menuPrice") val menuPrice: String,
    @SerializedName("optionItemReadResponseDtos") val optionItemReadResponseDtos: List<Option>
)

data class Option(
    @SerializedName("name") val name: String,
    @SerializedName("price") val price: Int,
)