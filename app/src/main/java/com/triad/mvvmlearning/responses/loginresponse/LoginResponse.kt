package com.triad.mvvmlearning.responses.loginresponse


data class LoginResponse(
    val data: Data,
    val message: String,
    val status: String
){

    data  class Data(
        val address: String,
        val app_url: String,
        val app_url_ios: String,
        val asm_code: String,
        val asm_name: String,
        val cal_days_in_month: String,
        val city: String,
        val email: String,
        val gps_validity: String,
        val gps_validity_create_store: String,
        val image: String,
        val mobile: String,
        val name: String,
        val uniquecode: String,
        val noti_count: String,
        val notification_count: String,
        val registered_store: String,
        val role: String,
        val rso_code: String,
        val state: String,
        val status: String,
        val target_achivement: String,
        val target_value: String,
        val today: String,
        val token: String,
        val total_store: String,
        val total_store_coverage: String,
        val total_store_visit: String,
        val total_unique_visit: String,
        val type: String,
        val username: String,
        val zone: String
    )
}