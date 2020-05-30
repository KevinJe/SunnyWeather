package com.sunnyweather.android

import android.app.Application
import android.content.Context

class SunnyWeatherApplication : Application() {

    companion object {
        lateinit var context: Context

        // 彩云天气令牌
        const val TOKEN = "H4dxCf4XHWUMhdpU"
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}