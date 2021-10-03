package com.example.myapplication

import android.app.Application
import com.example.bindingex.DaggerMyComponent

class MyApplication : Application() {
    var component = DaggerMyComponent.create()
}