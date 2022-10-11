package com.jackpan.taiwanpetadoptionapp_android

import com.jackpan.taiwanpetadoptionapp_android.data.PetData
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface TransService {
    @GET("pokemon")
    fun fetchPirateList(
        @Query("limit") limit: Int = 10,
        @Query("offset") offset: Int = 0
    ): Call<PirateResponse>

}