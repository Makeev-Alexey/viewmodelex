package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bindingex.MyComponent
import com.example.myapplication.databinding.ActivityMainBinding
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    private var _binding : ActivityMainBinding? = null
    private val binding get() = _binding!!
    lateinit //@Inject
    var myComponent: MyComponent
    lateinit @Inject
    var car: Car
    override fun onCreate(savedInstanceState: Bundle?) {
        myComponent = (applicationContext as MyApplication).component
        myComponent.inject(this)
//        myComponent = (applicationContext as MyApplication).component
//        myComponent.inject(this)
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}