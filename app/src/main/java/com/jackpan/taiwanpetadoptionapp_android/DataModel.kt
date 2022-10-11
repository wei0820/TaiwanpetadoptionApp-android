package com.jackpan.taiwanpetadoptionapp_android

import android.util.Log
import com.google.gson.Gson
import com.jackpan.taiwanpetadoptionapp_android.data.PetData
import okhttp3.Callback
import okhttp3.OkHttpClient
import okhttp3.Request
import okio.IOException
import retrofit2.Call
import retrofit2.Response


class DataModel {
    var gson = Gson()
    var client = OkHttpClient()
    var petArray = ArrayList<PetData>()

    fun getPetData(mgetResponseData :getResponseData){
        CallApi.retrofitService.fetchPirateList().enqueue(object:
            retrofit2.Callback<PirateResponse> {
            override fun onResponse(call: Call<PirateResponse>, response: Response<PirateResponse>) {
                Log.d("Jack","DataModel:"+response.body()!!.results[5].name)

                mgetResponseData.gettResponse(response.body()!!.results[5].name)

            }

            override fun onFailure(call: Call<PirateResponse>, t: Throwable) {
            }

        })
    }

    fun getPet(getPetResponseData: GetPetResponseData){

        val request = Request.Builder()
            .url("https://data.coa.gov.tw/Service/OpenData/TransService.aspx?UnitId=QcbUEzN6E6DL")
            .build()

        client.newCall(request).enqueue(object : Callback {
            override fun onFailure(call: okhttp3.Call, e: java.io.IOException) {
                Log.d("getPetData",call.toString())
            }

            override fun onResponse(call: okhttp3.Call, response: okhttp3.Response) {
                val resStr = response.body?.string()
                val posts: List<PetData> = Gson().fromJson(resStr, Array<PetData>::class.java).toList()
                posts.forEach {
                    Log.d("album_file",it.album_file)
                    petArray.add(it)


                }
                getPetResponseData.gettResponse(petArray)


            }
        })


    }
}
interface  getResponseData{
    fun gettResponse( s :String)
}
interface  GetPetResponseData{
    fun gettResponse( s :ArrayList<PetData>)

}