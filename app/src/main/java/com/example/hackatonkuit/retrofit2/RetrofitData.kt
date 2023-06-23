package com.example.hackatonkuit.retrofit2

import android.media.Image
import com.google.gson.annotations.SerializedName

data class Category(
    @SerializedName("id") val id: Long,
    @SerializedName("image") val image: String,
    @SerializedName("name") val name: String,
    @SerializedName("eng_name") val eng_name: String
)