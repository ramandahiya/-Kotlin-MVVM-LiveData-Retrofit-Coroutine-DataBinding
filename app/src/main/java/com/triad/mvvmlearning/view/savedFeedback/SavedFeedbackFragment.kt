package com.triad.surveyamazon.view.savedFeedback

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.triad.mvvmlearning.R
import com.triad.mvvmlearning.app.App
import com.triad.mvvmlearning.databinding.FragmentSavedFeedbackBinding
import com.triad.mvvmlearning.interfaces.ClickListener
import com.triad.mvvmlearning.network.SavedFeedbackApi
import com.triad.mvvmlearning.repository.SavedFeedRepository
import com.triad.mvvmlearning.responses.loginresponse.SavedFeedbackResponse
import com.triad.mvvmlearning.utility.Constants
import com.triad.mvvmlearning.utility.snackbar
import com.triad.mvvmlearning.utility.test
import com.triad.mvvmlearning.utility.visible
import com.triad.mvvmlearning.view.BaseFragment


class SavedFeedbackFragment : BaseFragment<SavedFeedbackViewModel, FragmentSavedFeedbackBinding, SavedFeedRepository>() {


    private lateinit var savedFeedbackAdapter: SavedFeedRecyclerAdpater

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


            viewModel.apiResponse.observe(viewLifecycleOwner, Observer {

           // binding.progressView.stopAnimation()
            binding.loaderLayout.visibility = View.GONE

               if(viewModel.apiResponse.value?.status  == Constants.ERRORCODE)
               {
                   binding.listViewSavedFeedback.visible(false)
                   binding.heading.snackbar(viewModel.apiResponse.value?.message.toString())

               }else{

               }


              //  savedFeedbackResponse = viewModel.apiResponse.value!!
              //  savedFeedbackAdapter.notifyDataSetChanged()

           })




        savedFeedbackAdapter = SavedFeedRecyclerAdpater(
            App.applicationContext(),  viewModel
           , object : ClickListener {
                override fun onItemClick(item: SavedFeedbackResponse.Data?,
                                         position: Int) {

                  //  Toast.makeText(context, "Hello Javatpoint", Toast.LENGTH_LONG).show()
//                    val args = Bundle()
//                    args.putParcelable("amount" , item)
//                    binding.header.findNavController().navigate(R.id.action_navigation_saved_feedback_to_navigation_detail, args)

                }
            })

        val layoutManager = LinearLayoutManager(context)

        binding.listViewSavedFeedback.layoutManager = layoutManager
        binding.listViewSavedFeedback.hasFixedSize()
        binding.listViewSavedFeedback.addItemDecoration(DividerItemDecoration(context, layoutManager.orientation))
        binding.listViewSavedFeedback.adapter = savedFeedbackAdapter

       // binding.listViewSavedFeedback.setAdapter(savedFeedbackAdapter)

       // apiCall()
    }




    private fun apiCall() {
        val paramObject = HashMap<String, String>()
//        paramObject.put("retailer_code", PreferenceConfiguration.getPreference(Constants.PreferenceConstants.UNIQUE_CODE))
//        paramObject.put("token", PreferenceConfiguration.getPreference(Constants.PreferenceConstants.TOKEN))
        paramObject.put("device", "Device")


        //var t : test = test()
        //t.testmetod()
//        method(object : test(){
//
//        })
        binding.loaderLayout.visibility = View.VISIBLE
        //binding.progressView.startAnimation()

        viewModel.fetch(paramObject)
    }

    fun method (test: test){

    }

    override fun getViewModel() = SavedFeedbackViewModel::class.java

    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): ViewDataBinding {

        return FragmentSavedFeedbackBinding.inflate(LayoutInflater.from(context))
    }



    override fun getFragmentRepository(): SavedFeedRepository {

        return SavedFeedRepository(remoteDataSource.buildApi(SavedFeedbackApi::class.java))

    }


}