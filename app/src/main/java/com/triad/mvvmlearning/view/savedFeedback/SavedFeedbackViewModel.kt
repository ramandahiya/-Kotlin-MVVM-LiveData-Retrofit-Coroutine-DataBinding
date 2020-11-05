package com.triad.surveyamazon.view.savedFeedback

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.triad.mvvmlearning.repository.SavedFeedRepository
import com.triad.mvvmlearning.responses.loginresponse.SavedFeedbackResponse
import kotlinx.coroutines.launch

class SavedFeedbackViewModel(private var repository: SavedFeedRepository) : ViewModel() {


    private val _apiResponse: MutableLiveData<SavedFeedbackResponse>
            = MutableLiveData<SavedFeedbackResponse>().apply { value?.data  = emptyList() }

    val apiResponse: LiveData<SavedFeedbackResponse> get() = _apiResponse


    fun fetch(body: HashMap<String,String>) = viewModelScope.launch {
        _apiResponse.value = repository.getData(body)
    }



}