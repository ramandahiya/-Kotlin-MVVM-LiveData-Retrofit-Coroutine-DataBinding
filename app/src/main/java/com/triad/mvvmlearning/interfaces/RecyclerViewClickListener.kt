package com.triad.surveyamazon.interfaces

import android.view.View
import com.triad.mvvmlearning.databinding.SavedFeedbackItemBinding

interface RecyclerViewClickListener {

    fun onRecyclerViewItemClick(view: View, movieItem: SavedFeedbackItemBinding)
}