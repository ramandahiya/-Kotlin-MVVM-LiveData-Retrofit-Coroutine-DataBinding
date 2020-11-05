package com.triad.surveyamazon.view.savedFeedback

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.triad.mvvmlearning.databinding.SavedFeedbackItemBinding
import com.triad.mvvmlearning.responses.loginresponse.SavedFeedbackResponse


class SavedFeedbackAdapter(
    private val context: Context,
    private val viewModel: SavedFeedbackViewModel) : BaseAdapter() {


    override fun getCount(): Int {
        if(viewModel.apiResponse.value==null)
            return 0;

       else return viewModel.apiResponse.value!!.data.size
    }

    override fun getItem(i: Int): SavedFeedbackResponse.Data? {
             return viewModel.apiResponse.value!!.data?.get(i)
    }

    override fun getItemId(i: Int): Long {
        return i.toLong()
    }

    override fun getView(i: Int, convertView: View?, viewGroup: ViewGroup?): View? {


        val binding: SavedFeedbackItemBinding
        if (convertView == null) {
            binding = SavedFeedbackItemBinding.inflate(LayoutInflater.from(context))
            binding.root.tag = binding
        } else {
            binding = convertView.tag as SavedFeedbackItemBinding
        }


        binding.model = getItem(i)


        return binding.root

    }

}