package com.triad.mvvmlearning.interfaces

import com.triad.mvvmlearning.responses.loginresponse.SavedFeedbackResponse

interface ClickListener {
    fun onItemClick(
        item: SavedFeedbackResponse.Data?,
        position: Int
    );

}