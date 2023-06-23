package com.example.hackatonkuit.ui.cart

import com.google.gson.annotations.SerializedName

data class CartItem(
    val id: Long,
    val temp: String,
    val size: String,
    val cup: String,
    val count: Int,
    val price: Int,
    val menuImage: String,
    val menuName: String,
    val menuEngName: String,
    val menuPrice: String,
    val optionItemReadResponseDtos: List<String>
)