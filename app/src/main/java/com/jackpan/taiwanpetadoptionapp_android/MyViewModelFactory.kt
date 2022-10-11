package com.jackpan.taiwanpetadoptionapp_android

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.jackpan.taiwanpetadoptionapp_android.viewmodel.MyViewModel

class MyViewModelFactory( var count :Int) : ViewModelProvider.Factory {


    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MyViewModel::class.java)){
            return MyViewModel(count) as T
        }
        throw IllegalArgumentException("Unknown View Model Class")    }
}