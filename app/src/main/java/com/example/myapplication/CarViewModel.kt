package com.example.myapplication

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import javax.inject.Inject

class CarViewModel @Inject constructor (var car: Car) : ViewModel() {
    var liveData : MutableLiveData<Car> = MutableLiveData()
    init {
        liveData.value = car

    }
}