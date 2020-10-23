package com.triad.mvvmlearning.repository



import com.triad.mvvmlearning.network.AuthApi
import com.triad.mvvmlearning.network.DashboardApi
import com.triad.mvvmlearning.network.NotificationApi

class DashboardRepository(private val api: DashboardApi) : BaseRepository(){

    suspend fun login(body: HashMap<String,String>) = safeApiCall {
        api.login(body)
    }


}