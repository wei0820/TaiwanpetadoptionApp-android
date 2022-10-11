package com.jackpan.taiwanpetadoptionapp_android

import com.google.gson.annotations.SerializedName

data class PirateResponse(
    @SerializedName("count") val count: Int,
    @SerializedName( "next") val next: String?,
    @SerializedName("previous") val previous: String?,
    @SerializedName( "results") val results: List<Pirate>
)