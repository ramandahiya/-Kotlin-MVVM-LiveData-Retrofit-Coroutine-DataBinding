package com.triad.surveyamazon.view.savedFeedback;

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.triad.mvvmlearning.databinding.SavedFeedbackItemBinding
import com.triad.mvvmlearning.interfaces.ClickListener
import com.triad.mvvmlearning.view.dashbord.ui.notifications.NotificationsViewModel

class NotiRecyclerAdpater(
    private val context: Context,
    private val mDeveloperModel: NotificationsViewModel,
    private val  listener: ClickListener

) :

    RecyclerView.Adapter<NotiRecyclerAdpater.DeveloperViewHolder>() {


    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): DeveloperViewHolder {

       val binding = SavedFeedbackItemBinding.inflate(LayoutInflater.from(context))

        return DeveloperViewHolder( binding)
    }

    override fun onBindViewHolder(mDeveloperViewHolder: DeveloperViewHolder, i: Int) {
        val currentStudent = mDeveloperModel.apiResponse.value?.data?.get(i)


        mDeveloperViewHolder.mDeveloperListItemBinding.item.setOnClickListener { listener.onItemClick(currentStudent,i) }

        mDeveloperViewHolder.mDeveloperListItemBinding.model = currentStudent

    }

    override fun getItemCount(): Int {
        if(mDeveloperModel.apiResponse.value?.data  == null )
            return 0

        else return mDeveloperModel.apiResponse.value!!.data.size
    }



    inner class DeveloperViewHolder(var mDeveloperListItemBinding: SavedFeedbackItemBinding) :
        RecyclerView.ViewHolder(mDeveloperListItemBinding.root)
}