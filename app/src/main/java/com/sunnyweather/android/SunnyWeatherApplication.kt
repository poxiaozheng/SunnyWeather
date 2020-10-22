package com.sunnyweather.android

import android.app.Application
import android.content.Context

class SunnyWeatherApplication : Application() {
    companion object {
        lateinit var context: Context
        const val TOKEN = "T6WKfJU6yZjm7EbR"
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}