package com.triad.mvvmlearning.utility

import com.triad.mvvmlearning.R
import com.triad.mvvmlearning.app.App
import com.triad.mvvmlearning.utility.UtilityMethods.decrypt
import com.triad.mvvmlearning.utility.UtilityMethods.encrypt

object PreferenceConfigration {

    private var sharedPreferences = App.instance?.getSharedPreferences(
        App.instance?.getResources()?.getString(R.string.app_name), 0
    )


    fun getPreference(key: String): String {
        if (sharedPreferences == null) {
            sharedPreferences =
                App.instance?.getSharedPreferences(
                    App.instance!!.getResources().getString(R.string.app_name), 0
                )
        }
        val temp = sharedPreferences!!.getString(key, "")
        return if (temp !== "") {
            decrypt(temp)
        } else {
            ""
        }
    }

    fun setPreference(key: String, value: String?) {
        if (value !== "")
            sharedPreferences!!.edit().putString(key, encrypt(value)).apply()
    }
}