package com.werockstar.dagger2demo.di.module

import android.app.Activity
import android.content.Context
import androidx.databinding.library.BuildConfig
import androidx.datastore.preferences.protobuf.Api
import com.triad.mvvmlearning.utility.Constants

import com.werockstar.dagger2demo.di.ActivityContext
import com.werockstar.dagger2demo.di.PerActivity

import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class ActivityModule(private val activity: Activity) {

    @PerActivity
    @Provides
    @ActivityContext
    fun provideContext(): Context = activity





}
