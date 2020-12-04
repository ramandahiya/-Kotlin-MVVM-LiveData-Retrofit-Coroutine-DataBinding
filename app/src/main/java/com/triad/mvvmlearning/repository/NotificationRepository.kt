package com.triad.mvvmlearning.repository


import com.triad.mvvmlearning.network.NotificationApi

class NotificationRepository(private val api: NotificationApi) : BaseRepository(){

    suspend fun login(body: HashMap<String,String>) = safeApiCall2 {
        api.login(body)
    }


}