package com.triad.mvvmlearning.app

import android.app.Application
import android.content.Context
import android.content.res.Configuration

/**
 * Created by Raman on 16-07-2016.
 */
class App : Application() {
    init {
        instance = this
    }

    companion object {
        var instance: App? = null

        fun applicationContext() : Context {
            return instance!!.applicationContext
        }
    }

    override fun onCreate() {
        super.onCreate()
        // initialize for any

        // Use ApplicationContext.
        // example: SharedPreferences etc...
        val context: Context = App.applicationContext()


    }


}