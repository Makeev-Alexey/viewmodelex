package com.example.myapplication

import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module

@Module
abstract class MyModole1 {
    @Binds
    abstract fun bindsViewModelFactory(factory: MyViewModelFactory): ViewModelProvider.Factory
}