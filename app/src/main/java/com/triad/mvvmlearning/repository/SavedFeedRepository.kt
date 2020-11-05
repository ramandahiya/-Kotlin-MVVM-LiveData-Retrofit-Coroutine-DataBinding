package com.triad.mvvmlearning.repository



import com.triad.mvvmlearning.network.SavedFeedbackApi

class SavedFeedRepository(private val api: SavedFeedbackApi) : BaseRepository(){

    suspend fun getData(body: HashMap<String,String>) = safeApiCall2 {
        api.login(body)
    }


}