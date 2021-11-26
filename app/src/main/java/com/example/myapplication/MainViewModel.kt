package com.example.myapplication

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private var count : Int = 0

    var  livedata = MutableLiveData<Int>(count)

    fun updateLiveData(){
        livedata.value = count + 1
    }



//    var counter : Int = 0
//
//    fun increment() {
//        counter ++
//    }
}