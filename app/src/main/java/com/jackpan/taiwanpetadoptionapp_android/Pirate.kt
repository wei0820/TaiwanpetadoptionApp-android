package com.jackpan.taiwanpetadoptionapp_android

import com.google.gson.annotations.SerializedName

data class Pirate(
    @SerializedName("name") val name: String,
    @SerializedName("url") val url: String
)