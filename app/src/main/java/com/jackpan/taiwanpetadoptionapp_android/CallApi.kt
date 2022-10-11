package com.jackpan.taiwanpetadoptionapp_android

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

object CallApi {
    private val retrofit = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl("https://pokeapi.co/api/v2/")
        .build()
    val retrofitService: TransService = retrofit.create(TransService::class.java)

}