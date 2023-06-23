package com.example.hackatonkuit.retrofit2

import com.example.hackatonkuit.BuildConfig
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val BASE_URL= BuildConfig.BASE_URL

fun getRetrofitInterface(): RetrofitInterface {
    val gson: Gson = GsonBuilder()
        .setLenient()
        .create()
    var retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create(gson))
        .client(retrofitOkHttpClient())
        .build()

    return retrofit.create(RetrofitInterface::class.java)
}


fun retrofitOkHttpClient(): OkHttpClient {
    val builder = OkHttpClient.Builder()
    val logging = HttpLoggingInterceptor()
    logging.level = HttpLoggingInterceptor.Level.BODY

    return builder.addInterceptor(logging).build()
}