package com.triad.mvvmlearning.network

import com.triad.mvvmlearning.responses.loginresponse.LoginResponse
import com.triad.mvvmlearning.utility.Constants
import retrofit2.http.Body
import retrofit2.http.POST

interface DashboardApi {
     @POST(Constants.Url.login)
     suspend fun login(@Body body: HashMap<String,String>) : Array<LoginResponse>

 }