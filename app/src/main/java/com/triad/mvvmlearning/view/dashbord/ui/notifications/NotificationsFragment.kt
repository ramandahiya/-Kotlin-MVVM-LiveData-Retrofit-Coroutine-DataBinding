package com.triad.mvvmlearning.view.dashbord.ui.notifications

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.Observer
import com.triad.mvvmlearning.R
import com.triad.mvvmlearning.databinding.FragmentNotificationsBinding
import com.triad.mvvmlearning.network.NotificationApi
import com.triad.mvvmlearning.network.Resource
import com.triad.mvvmlearning.repository.NotificationRepository
import com.triad.mvvmlearning.view.BaseFragment


class NotificationsFragment  : BaseFragment<NotificationsViewModel, FragmentNotificationsBinding, NotificationRepository>() {

  override fun onActivityCreated(savedInstanceState: Bundle?) {
    super.onActivityCreated(savedInstanceState)


    viewModel.loginResponse.observe(viewLifecycleOwner, Observer {

      when (it) {
        is Resource.Success -> {

//          binding.viewmodel = it.value


          Toast.makeText( requireContext(),"Logged In", Toast.LENGTH_SHORT).show()

        }

        is Resource.Failure -> {

          Toast.makeText(requireContext(),"Login Failed", Toast.LENGTH_SHORT).show()
        }
      }

    })



  }








  override fun getViewModel() = NotificationsViewModel::class.java

  override fun getFragmentBinding(
    inflater: LayoutInflater,
    container: ViewGroup?) : ViewDataBinding {

    return  DataBindingUtil.inflate(inflater, R.layout.fragment_notifications, container, false);

  }


  override fun getFragmentRepository(): NotificationRepository {

    return  NotificationRepository(remoteDataSource.buildApi(NotificationApi::class.java))

  }

}