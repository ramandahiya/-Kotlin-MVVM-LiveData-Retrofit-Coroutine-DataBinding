package com.triad.mvvmlearning.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.triad.mvvmlearning.repository.*
import com.triad.mvvmlearning.view.dashbord.ui.dashboard.DashboardViewModel
import com.triad.mvvmlearning.view.dashbord.ui.home.HomeViewModel
import com.triad.mvvmlearning.view.dashbord.ui.notifications.NotificationsDetailsViewModel
import com.triad.mvvmlearning.view.dashbord.ui.notifications.NotificationsViewModel
import com.triad.mvvmlearning.view.login.LoginViewModel
import com.triad.surveyamazon.view.savedFeedback.SavedFeedbackViewModel

@Suppress("UNCHECKED_CAST")
class ViewModelFactory(private val repository: BaseRepository): ViewModelProvider.NewInstanceFactory(){

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {

        return when{

            modelClass.isAssignableFrom(LoginViewModel::class.java) -> LoginViewModel(
                repository as LoginRepository
            ) as T

            modelClass.isAssignableFrom(NotificationsViewModel::class.java) -> NotificationsViewModel(
                repository as NotificationRepository
            ) as T

            modelClass.isAssignableFrom(HomeViewModel::class.java) -> HomeViewModel(
                repository as HomeRepository
            ) as T

            modelClass.isAssignableFrom(DashboardViewModel::class.java) -> DashboardViewModel(
                repository as DashboardRepository
            ) as T

            modelClass.isAssignableFrom(NotificationsDetailsViewModel::class.java) -> NotificationsDetailsViewModel(
                repository as NotificationRepository
            ) as T
            modelClass.isAssignableFrom(SavedFeedbackViewModel::class.java) -> SavedFeedbackViewModel(
                repository as SavedFeedRepository
            ) as T

            else -> throw IllegalArgumentException("ViewModel Not Found")
        }

    }


}