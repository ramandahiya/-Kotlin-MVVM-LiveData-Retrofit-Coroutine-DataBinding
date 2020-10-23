package com.triad.mvvmlearning.repository

import com.triad.mvvmlearning.network.AuthApi

class LoginRepository(private val api: AuthApi) : BaseRepository(){

    suspend fun login(body: HashMap<String,String>) = safeApiCall {
        api.login(body)
    }


}