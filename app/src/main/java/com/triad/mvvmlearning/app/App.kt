package com.triad.mvvmlearning.app

import android.app.Application
import android.content.Context
import com.werockstar.dagger2demo.di.component.AppComponent
import com.werockstar.dagger2demo.di.component.DaggerAppComponent
import com.werockstar.dagger2demo.di.module.ActivityModule
import com.werockstar.dagger2demo.di.module.AndroidModule
import com.werockstar.dagger2demo.di.module.ApplicationModule

/**
 * Created by Raman on 16-07-2018.
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



    lateinit var component: AppComponent

    override fun onCreate() {
        super.onCreate()

        createComponent()
    }

    protected open fun createComponent() {
        component = DaggerAppComponent.builder()
            .applicationModule(ApplicationModule(this))

            .androidModule(AndroidModule())            .build()
    }



}