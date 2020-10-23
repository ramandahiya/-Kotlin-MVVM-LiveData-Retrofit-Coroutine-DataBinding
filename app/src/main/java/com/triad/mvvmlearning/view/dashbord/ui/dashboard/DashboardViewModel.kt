package com.triad.mvvmlearning.view.dashbord.ui.dashboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.triad.mvvmlearning.network.Resource
import com.triad.mvvmlearning.repository.DashboardRepository
import com.triad.mvvmlearning.repository.NotificationRepository
import com.triad.mvvmlearning.responses.loginresponse.LoginResponse
import kotlinx.coroutines.launch

class DashboardViewModel(
    private var repository: DashboardRepository
) : ViewModel() {

    private val _loginResponse: MutableLiveData<Resource<Array<LoginResponse>>> = MutableLiveData()

    val loginResponse: LiveData<Resource<Array<LoginResponse>>>
        get() = _loginResponse

    fun login(body: HashMap<String,String>) = viewModelScope.launch {
        _loginResponse.value = repository.login(body)
    }

}