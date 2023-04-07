package com.marquiseanges.weatherapp

import android.app.Application
import com.marquiseanges.weatherapp.data.Repository
import com.marquiseanges.weatherapp.data.network.RetrofitApi

class WeatherApp:Application() {
    //TOdo 7: Initialize the Repository class
    val repository: Repository by lazy {
        Repository(RetrofitApi.service)
    }
}