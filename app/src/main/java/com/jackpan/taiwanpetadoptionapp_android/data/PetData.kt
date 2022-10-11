package com.jackpan.taiwanpetadoptionapp_android.data

import com.google.gson.annotations.SerializedName

data class PetData(
    @SerializedName("animal_id")var animal_id : Int,
    @SerializedName("animal_subid") var animal_subid : String,
    @SerializedName("animal_area_pkid")var animal_area_pkid: Int,
    @SerializedName("animal_shelter_pkid")var animal_shelter_pkid: Int,
    @SerializedName("animal_place") var animal_place : String,
    @SerializedName("animal_kind") var animal_kind : String,
    @SerializedName("animal_sex") var animal_sex : String,
    @SerializedName("animal_bodytype") var animal_bodytype: String,
    @SerializedName("animal_colour")var animal_colour: String,
    @SerializedName("animal_age")var animal_age: String,
    @SerializedName("animal_sterilization") var animal_sterilization: String,
    @SerializedName("animal_bacterin") var animal_bacterin: String,
    @SerializedName("animal_foundplace")var animal_foundplace: String,
    @SerializedName("animal_title")var animal_title: String,
    @SerializedName("animal_status")var animal_status: String,
    @SerializedName("animal_remark")var animal_remark: String,
    @SerializedName("animal_caption")var animal_caption: String,
    @SerializedName("animal_opendate")var animal_opendate: String,
    @SerializedName("animal_closeddate") var animal_closeddate: String,
    @SerializedName("animal_update") var animal_update: String,
    @SerializedName("animal_createtime") var animal_createtime: String,
    @SerializedName("shelter_name")var shelter_name: String,
    @SerializedName("album_file") var album_file: String,
    @SerializedName("album_update")var album_update: String,
    @SerializedName("cDate")var cDate : String,
    @SerializedName("shelter_address")var shelter_address : String,
    @SerializedName("shelter_tel")var shelter_tel : String

)