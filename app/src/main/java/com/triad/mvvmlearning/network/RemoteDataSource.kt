package com.triad.mvvmlearning.network

import androidx.databinding.library.BuildConfig
import com.triad.mvvmlearning.utility.Constants
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RemoteDataSource {


    fun <Api> buildApi(api: Class<Api>): Api
    {

        return Retrofit.Builder()
            .baseUrl(Constants.baseUrl)
            .client(
                OkHttpClient.Builder().also { client ->
                    if(BuildConfig.DEBUG) {
                        val logging = HttpLoggingInterceptor()
                        logging.setLevel(HttpLoggingInterceptor.Level.BODY)
                        client.addInterceptor(logging)
                    }
                }.build()
            )
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(api)
    }

}