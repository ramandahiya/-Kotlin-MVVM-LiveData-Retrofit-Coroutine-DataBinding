package com.triad.mvvmlearning.repository


import com.triad.mvvmlearning.network.NotificationApi

class NotificationDetailsRepository(private val api: NotificationApi) : BaseRepository(){

    suspend fun login(body: HashMap<String,String>) = safeApiCall {
        api.login(body)
    }


}