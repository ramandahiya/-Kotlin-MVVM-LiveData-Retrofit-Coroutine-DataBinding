package com.triad.mvvmlearning.view.dashbord.ui.notifications

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.Observer
import androidx.navigation.fragment.NavHostFragment.findNavController
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

          //  Toast.makeText(context, "Hello Javatpoint", Toast.LENGTH_LONG).show()
//                    val args = Bundle()
//        args.putParcelable("amount" , item)
//        findNavController().navigate(R.id.action_navigation_saved_feedback_to_navigation_detail, args)

      }
      })


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