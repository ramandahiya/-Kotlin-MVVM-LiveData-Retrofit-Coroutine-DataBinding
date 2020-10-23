package com.triad.mvvmlearning.repository



import com.triad.mvvmlearning.network.AuthApi
import com.triad.mvvmlearning.network.HomeApi
import com.triad.mvvmlearning.network.NotificationApi

class HomeRepository(private val api: HomeApi) : BaseRepository(){

    suspend fun login(body: HashMap<String,String>) = safeApiCall {
        api.login(body)
    }


}