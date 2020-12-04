package com.triad.mvvmlearning.view.dashbord.ui.notifications

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.Observer
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment.findNavController
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.triad.mvvmlearning.R
import com.triad.mvvmlearning.app.App
import com.triad.mvvmlearning.databinding.FragmentNotificationsBinding
import com.triad.mvvmlearning.interfaces.ClickListener
import com.triad.mvvmlearning.network.NotificationApi
import com.triad.mvvmlearning.network.Resource
import com.triad.mvvmlearning.repository.NotificationRepository
import com.triad.mvvmlearning.responses.loginresponse.SavedFeedbackResponse
import com.triad.mvvmlearning.view.BaseFragment
import com.triad.surveyamazon.view.savedFeedback.NotiRecyclerAdpater
import com.triad.surveyamazon.view.savedFeedback.SavedFeedRecyclerAdpater


class NotificationsFragment  : BaseFragment<NotificationsViewModel, FragmentNotificationsBinding, NotificationRepository>() {
  private lateinit var notificationAdapter: NotiRecyclerAdpater

  override fun onActivityCreated(savedInstanceState: Bundle?) {
    super.onActivityCreated(savedInstanceState)

    notificationAdapter = NotiRecyclerAdpater(
      App.applicationContext(),  viewModel
      , object : ClickListener {
        override fun onItemClick(item: SavedFeedbackResponse.Data?,
                                 position: Int) {

//          val bundle = bundleOf("amount" to "data")
//          it.findNavController().navigate(R.id.action_loginFragment_to_signUpFragment, bundle)


                    val args = Bundle()
        args.putParcelable("amount" , item)
       binding.recyclerView.findNavController().navigate(R.id.action_navigation_notifications_to_navigation_notifications_details, args)

      }
      })

    val layoutManager = LinearLayoutManager(context)

    binding.recyclerView.layoutManager = layoutManager
    binding.recyclerView.hasFixedSize()
    binding.recyclerView.addItemDecoration(DividerItemDecoration(context, layoutManager.orientation))
    binding.recyclerView.adapter = notificationAdapter

    viewModel.apiResponse.observe(viewLifecycleOwner, Observer {



          Toast.makeText( requireContext(),"Logged In", Toast.LENGTH_SHORT).show()



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