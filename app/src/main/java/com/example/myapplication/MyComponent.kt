package com.example.bindingex

import com.example.myapplication.BlankFragment
import com.example.myapplication.MainActivity
import com.example.myapplication.MyModole1
import dagger.Component

@Component(modules = [MyModule::class, MyModole1::class])
interface MyComponent {
    fun inject(mainActivity: MainActivity)
    fun inject(blankFragment: BlankFragment)

}