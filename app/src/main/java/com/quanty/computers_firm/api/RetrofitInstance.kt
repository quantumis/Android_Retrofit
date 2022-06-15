package com.quanty.computers_firm.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object RetrofitInstance {
    private val retrofit by lazy {
        Retrofit.Builder().baseUrl("http://10.0.2.2:62692/").addConverterFactory(GsonConverterFactory.create()).build()
    }
    val api: ApiService by lazy {
        retrofit.create(ApiService::class.java)
    }
}