package com.triad.mvvmlearning.responses.loginresponse

import android.os.Parcel
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

data class SavedFeedbackResponse(
    var data: List<Data> ,
    var message: String = "",
    var status: String = ""
){
    @Parcelize
data class Data (
    var customer_mobile: String,
    var customer_name: String,
    var date: String,
    var id: String
): Parcelable

}