package com.triad.mvvmlearning.network

import androidx.databinding.library.BuildConfig
import com.triad.mvvmlearning.app.App
import com.triad.mvvmlearning.utility.Constants

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Inject

class RemoteDataSource {


    @Inject
    lateinit var ok : OkHttpClient

    fun <Api> buildApi(api: Class<Api>): Api
    {
        (App.instance as App).component
            .inject(this)

        

       // return this.remoteDataSource2

        return Retrofit.Builder()
            .baseUrl(Constants.baseUrl)
            .client(
               ok
            )
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(api)
    }

}