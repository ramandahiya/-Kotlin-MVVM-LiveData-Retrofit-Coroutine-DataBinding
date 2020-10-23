package com.triad.mvvmlearning.view.dashbord.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.Observer
import com.triad.mvvmlearning.R
import com.triad.mvvmlearning.databinding.FragmentHomeBinding
import com.triad.mvvmlearning.network.HomeApi
import com.triad.mvvmlearning.network.Resource
import com.triad.mvvmlearning.repository.HomeRepository
import com.triad.mvvmlearning.view.BaseFragment

class HomeFragment   : BaseFragment<HomeViewModel, FragmentHomeBinding, HomeRepository>() {

  override fun onActivityCreated(savedInstanceState: Bundle?) {
    super.onActivityCreated(savedInstanceState)


    viewModel.loginResponse.observe(viewLifecycleOwner, Observer {

      when (it) {
        is Resource.Success -> {

         // binding.text_home = it.value


          Toast.makeText( requireContext(),"Logged In", Toast.LENGTH_SHORT).show()

        }

        is Resource.Failure -> {

          Toast.makeText(requireContext(),"Login Failed", Toast.LENGTH_SHORT).show()
        }
      }

    })



  }








  override fun getViewModel() =HomeViewModel::class.java

  override fun getFragmentBinding(
    inflater: LayoutInflater,
    container: ViewGroup?) : ViewDataBinding {

    return  DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false);

  }


  override fun getFragmentRepository(): HomeRepository {

    return  HomeRepository(remoteDataSource.buildApi(HomeApi::class.java))

  }


}