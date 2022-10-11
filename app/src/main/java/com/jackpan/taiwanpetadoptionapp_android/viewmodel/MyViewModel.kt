package com.jackpan.taiwanpetadoptionapp_android.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jackpan.taiwanpetadoptionapp_android.DataModel
import com.jackpan.taiwanpetadoptionapp_android.GetPetResponseData
import com.jackpan.taiwanpetadoptionapp_android.data.Book
import com.jackpan.taiwanpetadoptionapp_android.data.PetData
import com.jackpan.taiwanpetadoptionapp_android.getResponseData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

  class MyViewModel( var count :Int) :ViewModel() {
      var mDataModel = DataModel()
      var mutableLiveData = MutableLiveData<String>()
      var arrayliveDat = MutableLiveData<ArrayList<PetData>>()

     fun getData() : LiveData<String>{
//         viewModelScope.launch(Dispatchers.IO) {
//
//
//
//         }
         mDataModel.getPetData(object : getResponseData {
             override fun gettResponse(s: String) {
                 Log.d("Jack","MyViewModel:"+s)
                 mutableLiveData.value = s




             }
         } )
         return  mutableLiveData
     }

      fun getPet() : LiveData<ArrayList<PetData>>{
            mDataModel.getPet(object : GetPetResponseData {
                override fun gettResponse(s: ArrayList<PetData>) {
                    viewModelScope.launch {
                        arrayliveDat.value = s

                    }
                }
            })
          return  arrayliveDat
      }


    override fun onCleared() {
        super.onCleared()
    }
}