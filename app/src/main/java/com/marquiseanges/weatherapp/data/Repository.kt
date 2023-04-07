package com.marquiseanges.weatherapp.data

import com.marquiseanges.weatherapp.data.network.WeatherService
import com.marquiseanges.weatherapp.models.WeatherResponse

class Repository(private val service: WeatherService) {

    suspend fun fetchWeatherData(lat:Double,lon:Double,units:String?,appId:String?): WeatherResponse {
        return service.getWeather(lat,lon,units,appId)
    }
}