package com.triad.mvvmlearning.view.dashbord.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.Observer
import androidx.navigation.findNavController
import com.triad.mvvmlearning.R
import com.triad.mvvmlearning.databinding.FragmentDashboardBinding
import com.triad.mvvmlearning.network.DashboardApi
import com.triad.mvvmlearning.network.Resource
import com.triad.mvvmlearning.repository.DashboardRepository
import com.triad.mvvmlearning.view.BaseFragment

class DashboardFragment  : BaseFragment<DashboardViewModel, FragmentDashboardBinding, DashboardRepository>() {

  override fun onActivityCreated(savedInstanceState: Bundle?) {

    super.onActivityCreated(savedInstanceState)


    binding.title.setOnClickListener{

      val bundle = bundleOf("amount" to "data")
      it.findNavController().navigate(R.id.action_navigation_dashboard_to_navigation_savedfeedback, bundle)
    }


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








  override fun getViewModel() = DashboardViewModel::class.java

  override fun getFragmentBinding(
    inflater: LayoutInflater,
    container: ViewGroup?) : ViewDataBinding {

    return  DataBindingUtil.inflate(inflater, R.layout.fragment_dashboard, container, false);

  }


  override fun getFragmentRepository(): DashboardRepository {

    return  DashboardRepository(remoteDataSource.buildApi(DashboardApi::class.java))

  }


}