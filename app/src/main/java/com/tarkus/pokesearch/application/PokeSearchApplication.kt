package com.tarkus.pokesearch.application

import android.app.Application
import android.content.Context
import com.tarkus.pokesearch.BuildConfig
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber

/**
 * Starts Application for the code generation of the Hilt Components
 */
@HiltAndroidApp
class PokeSearchApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) Timber.plant(Timber.DebugTree())
        appContext = applicationContext
    }

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
    }
    companion object{
        var appContext : Context? = null
            private set
    }
}