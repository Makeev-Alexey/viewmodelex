package com.example.bindingex

import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.Car
import com.example.myapplication.Engine
import com.example.myapplication.Fuel
import com.example.myapplication.MyViewModelFactory
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
class MyModule {
    @Provides
    fun createCar(engine: Engine) : Car {
        return Car("shkoda", 2, 100, engine)
    }
    @Provides
    fun createFuel() : Fuel {
        return Fuel("lukoil")
    }
    @Provides
    fun createEngine(fuel: Fuel) : Engine {
        return Engine(fuel)
    }
}