package com.triad.mvvmlearning.repository



import com.triad.mvvmlearning.network.HomeApi

class HomeRepository(private val api: HomeApi) : BaseRepository(){

    suspend fun login(body: HashMap<String,String>) = safeApiCall {
        api.login(body)
    }


}