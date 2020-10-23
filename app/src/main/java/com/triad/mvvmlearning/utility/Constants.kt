package com.triad.mvvmlearning.utility

/**
 * Created by Raman on 15-07-2016.
 */
interface Constants {
    interface Url {
        companion object {
            const val get_allow_backdated_days =
                baseUrl + "get_data/get_allow_backdated_days"
            const val APP_BUNDLE_SALE_IN_SUBMIT =
                baseUrl + "am/stock/bundle-stock-in"
            const val APP_FORGOT_PASSWORD =
                baseUrl + "login/forgot-password"
            const val typeOfSale =
                baseUrl + "get_data/type_of_sale"
            const val AUDIT_COMPLETE =
                baseUrl + "am/audit/done"
            const val AUDIT_ANSWER =
                baseUrl + "am/audit/save-answer"
            const val AUDIT_lIST =
                baseUrl + "am/audit/audit-list"
            const val AUDIT =
                baseUrl + "am/audit"
            const val login =
                baseUrl + "login"
            const val dashboard_data =
                baseUrl + "am/dashboard"
            const val leave_cancel =
                baseUrl + "am/workforce/cancel-leave"
            const val change_password =
                baseUrl + "login/change-password"
            const val update_details =
                baseUrl + "login/update-profile"
            const val am_lead_kre =
                baseUrl + "am/lead/are"
            const val am_lead_kre_date =
                baseUrl + "am/lead/are-date"
            const val am_lead_kre_status =
                baseUrl + "am/lead/are-status"
            const val am_lead_form =
                baseUrl + "am/lead/am"
            const val am_notification =
                baseUrl + "get-data/notification"
            const val am_stock_in_access =
                baseUrl + "am/stock/accessory-stock-in"
            const val am_access_stock_modelwise =
                baseUrl + "am/stock-data/stock-modelwise-accessory"
            const val am_stock_modelwise =
                baseUrl + "am/stock-data/stock-modelwise"
            const val am_stock_form =
                baseUrl + "am/stock-data/stock-form"
            const val am_stock_fsns =
                baseUrl + "am/stock-data/stock-dsn"
            const val echo_bundle_stock_form =
                baseUrl + "am/stock-data/echo-bundle-stock-form"
            const val echo_bundle_stock_in =
                baseUrl + "am/stock-data/echo-bundle-stock-in-hand"
            const val echo_bundle_stock_fsn =
                baseUrl + "am/stock-data/echo-bundle-stock-dsn"
            const val echo_bundle_am_stock_fsn_sellout =
                baseUrl + "am/sellout/echo_twin_pack"
            const val echo_bundle_stock_in2 =
                baseUrl + "am/stock/echo-bundle-stock-in"
            const val walkin_form =
                baseUrl + "am/beatplan/walkin-form"
            const val am_kre_remarks =
                baseUrl + "am/beatplan/am-kre-remarks"
            const val non_beat_store =
                baseUrl + "am/beatplan/beatplan_non_beat_store"
            const val beat_plan_mom =
                baseUrl + "am/beatplan/beat-plan-mom"
            const val stock_in_form =
                baseUrl + "am/beatplan-stock/stock-in"
            const val am_stock_fsn_sellout =
                baseUrl + "am/beatplan-stock/sell-out"
            const val am_stock_fsn_sellout_access =
                baseUrl + "am/beatplan-stock/accessory-sellout"
            const val new_mom =
                baseUrl + "am/beatplan/beat-new-mom"
            const val plan_lead =
                baseUrl + "am/beatplan/beat-plan-lead"
            const val plan_performance =
                baseUrl + "am/beatplan/beat-plan-performance"
            const val plan_stock_n_sell =
                baseUrl + "am/beatplan/beat-stock-n-sell"
            const val plan_ticket =
                baseUrl + "am/beatplan/beat-plan-ticket"
            const val beat_done =
                baseUrl + "am/beatplan/beat-done"
            const val plan_walkin_data =
                baseUrl + "am/beatplan/beat-walkin"
            const val plan_ticket_escalate =
                baseUrl + "am/beatplan/beat-ticket-escalation"
            const val edit_plan_walkin_data =
                baseUrl + "am/beatplan/beat-edit-walkin"
            const val feedback_check =
                baseUrl + "am/beatplan/echo-status-check-only"
            const val feedback =
                baseUrl + "am/beatplan/echo-status-check"
            const val allocation =
                baseUrl + "am/workforce/allocation"
            const val attendance_data =
                baseUrl + "am/workforce/attendance-data"
            const val allocation_data =
                baseUrl + "am/workforce/allocation-data"
            const val Workforce_allocation_add =
                baseUrl + "am/workforce/allocate-are"
            const val Workforce_leave_status =
                baseUrl + "am/workforce/change-leave-status"
            const val leave_data =
                baseUrl + "am/workforce/leave-data"
            const val performance_product_mix =
                baseUrl + "am/performance/product-mix"
            const val performance_product_mix_store_all =
                baseUrl + "am/performance/product-mix-store-all"
            const val kre_sales_data =
                baseUrl + "am/stock-data/am-are-sales" ///
            const val kre_store_device_acc_wise_sell_data =
                baseUrl + "am/get-data/are-retailer-device-acc-wise-sell-data"
            const val capture_location_store_list =
                baseUrl + "am/get-data/capture-location-retailer-list" ///
            const val update_store_lat_long =
                baseUrl + "am/update-data/update-retailer-lat-long"
            const val model_data =
                baseUrl + "am/get-data/model-data"
            const val apply_leave_for_kre =
                baseUrl + "am/workforce/apply-leave-for-are"
            const val am_access_stock_form =
                baseUrl + "am/stock-data/stock-form-accessory"
            const val sales_history =
                baseUrl + "am/stock-data/sales-history"

            //Stock out activity
            const val STOCK_ACTIVITY =
                baseUrl + "am/activity/sellout-data"

            //Stock In activity
            const val ACTIVITY_DASHBOARD =
                baseUrl + "am/activity/dashboard"

            // list activity
            const val ACTIVITIES =
                baseUrl + "am/activity/activity-list"

            //Sellout activity
            const val Activity_APP_WALK_IN_LIST =
                baseUrl + "am/activity/walkin-list"
            const val ACTIVITY_CUSTOMER_LEAD_LIST =
                baseUrl + "am/activity/view-lead"
            const val ACTIVITY_CUSTOMER_WALKIN =
                baseUrl + "am/activity/walkin-form"
            const val activity_fsns =
                baseUrl + "am/activity/sellout-dsn-wise-data"
            const val ACTIVITY_create_new_lead =
                baseUrl + "am/activity/create-lead"
            const val ACTIVITY_update_lead =
                baseUrl + "am/activity/update-lead"
            const val Product_list =
                baseUrl + "get-data/sku-list"
            const val Product_list_Without_Dsn =
                baseUrl + "get-data/sku-list_non_dsn"
            const val performance =
                baseUrl + "am/performance"
            const val APP_VIEW_LEAVE =
                baseUrl + "am/leave/view"
            const val APP_APPLY_LEAVE =
                baseUrl + "am/leave/request"
            const val APP_CANCEL_LEAVE =
                baseUrl + "am/leave/cancel"
            const val Allocate_krs =
                baseUrl + "am/workforce/allocate-ars"
            const val Store_search =
                baseUrl + "am/get-data/search-store"
            const val Winner_List =
                baseUrl + "am/super-seller-winner-list"
            const val Winner_UPLOAD_PROOF =
                baseUrl + "am/super-seller-winner-data-update"
            const val Verify_OTP =
                baseUrl + "am/super-seller-verify-otp"
            const val resend_OTP =
                baseUrl + "user-app/confirm-delivery-gift"
            const val echo_soft_bundle_sellout =
                baseUrl + "am/sellout/soft_bundle"
            const val SELL_OUT_twin_ACTIVITY =
                baseUrl + "am/activity/echo_twin_pack_sellout"
            const val SELL_OUT_ACTIVITY =
                baseUrl + "am/activity/sellout"
            const val updatePJP =
                baseUrl + "am/update-data/update-pjp"
            const val tpr2 =
                baseUrl + "am/get-data/tpr-detail"
            const val tpr =
                baseUrl + "am/get-data/tpr-list"
            const val SOD =
                baseUrl + "am/get-data/sod-check-list"
            const val sale_out_ticket_list =
                baseUrl + "am/ticket/ticket-sellout-list"
            const val Ticket_Subject =
                baseUrl + "get-data/ticket-subject"
            const val am_view_ticket =
                baseUrl + "am/ticket/view-ticket"
            const val am_raise_ticket =
                baseUrl + "am/ticket/raise-ticket"
            const val APP_NOTIFICATION_UPDATE_TOKEN =
                baseUrl + "update-token"
            const val Logout =
                baseUrl + "login/logout"
            const val Dashboard_targets =
                baseUrl + "am/get-data/targets"
            const val caught_exception =
                baseUrl + "get-data/caught-exception"
            const val CheckListStatus =
                baseUrl + "am/get_data/sod_eod_compliance"
            const val AREARSDATA =
                baseUrl + "am/workforce/are_ars_data"
            const val AREARSAttendanceView =
                baseUrl + "am/workforce/are_ars_compliance"
            const val SELLOUT_WITHOUT_DSN =
                baseUrl + "am/non_dsn"
            const val NON_DSN_LIST =
                baseUrl + "am/non_dsn/get_non_dsn_list"
            const val DSNS_IN_NON_DSN_LIST_Item =
                baseUrl + "am/non_dsn/get_non_dsn"
            const val STORES_IN_NON_DSN_LIST =
                baseUrl + "am/non_dsn/get_non_dsn_store_list"
            const val update_retailer_share_detail =
                baseUrl + "am/update_data/update_retailer_share_detail"
            const val display_unit =
                baseUrl + "am/display_unit/add"
            const val demo_dsn_list =
                baseUrl + "am/display_unit/list"
        }
    }

    interface FragmentTags {
        companion object {
            const val SelloutWithoutDSN_DSNLIST = "SelloutWithoutDSN_DSNLIST"
            const val ASINLIST = "Asin List"
            const val AreArsAttendanceView = "AreArs Attendance View"
            const val SelloutWithoutDSNview = "SelloutWithoutDSNview"
            const val SelloutWithoutDSN = "SelloutWithoutDSN"
            const val Allocation = "Allocation"
            const val DemoUnitListfragment = "DemoUnitListfragment"
            const val Sales_DateWise = "Sales Datewise"
            const val Audit = "Master Audit List"
            const val Leave = "Leave"
            const val RetialerStatus = "Retailer Status"
            const val SaleHistory = "Sales History"
            const val SellOut = "Sell out"
            const val StoreStockSell = "StoreStockSell"
            const val ProductMix = "ProductMix"
            const val StoreWakin = "StoreWalkin"
            const val StoreAudit = "StoreAudit"
            const val StoreAddMom = "StoreAddMom"
            const val StorePerformance = "StorePerformance"
            const val StoreTicket = "Store Ticket"
            const val DashBoard = "Dashboard"
            const val Stock = "Stock n Sales"
            const val StoreStock = "StoreStock"
            const val StoreStockIn = "StoreStockIn"
            const val StoreStockInFSN = "StoreStockInFSN"
            const val Performance = "Performance"
            const val Beat = "Beat Plan"
            const val MOM = "Last MOM"
            const val WorkForce = "My team"
            const val Lead = "Lead"
            const val Pdf = "Pdf"
            const val Scheme = "Scheme"
            const val SchemeDescription = "SchemeDescription"
            const val ProductList = "Product List"
            const val FAQ = "FAQ"
            const val StoreSaleInSubmitFragment = "StoreSaleInSubmitFragment"
            const val StoreStockInHandFragment = "StoreStockInHandFragment"
            const val SaleLog = "Sale Out"
            const val Barcode = "Barcode"
            const val Support = "Support"
            const val StoreLocation = "Store Location"
            const val Support_Raise_Ticket = "Raise Ticket"
            const val Support_List = "Audit"
            const val Support_Audit = "Audit Dashboard"
            const val Support_View_Ticket_Escalation = "View Ticket Escalation"
            const val Support_Leave = "Leave"
            const val Support_Apply_Leave = "ApplyLeave"
            const val View_Profile = "Profile"
            const val Change_Password = "Change Password"
            const val Attendance = "Attendance"
            const val Notification = "Notifications"
            const val Customer = "Leads"
            const val Customer_Walkin = "Walk In"
            const val Customer_Create_Lead = "Customer Create Lead"
            const val Customer_View_Lead = "Customer View Lead"
            const val Compliance = "Compliance"
            const val StockIn = "StockIn"
            const val Stock_In_Fsn = "Stock In Fsn"
            const val SellOutManual = "SellOutManual"
            const val kreSales = "kreSales"
            const val Leaves = "Leaves"
            const val Store = "Store"
            const val RetailerAdoptionFragment = "RetailerAdoptionFragment"
            const val RaiseTicket = "Raise Ticket"
            const val DisplayUnitFragment = "DisplayUnitFragment"
            const val STORE_VISIT = "STORE_VISIT"
            const val StoreLead = "Store Lead"
            const val StoreAddWalkin = "StoreAddWalkin"
            const val LeadFragmentkre = "LeadFragmentkre"
            const val LeadFragmentkreDate = "LeadFragmentkreDate"
            const val Image_view = "Image_view"
            const val Performance_Product_Mix = "PerformanceProductMix"
            const val Performance_Product_Mix_Store = "PerformanceProductMixStore"
            const val Performance_Product_Mix_Store_All = "PerformanceProductMixStoreAll"
            const val Feeds = "Feeds"
            const val Activity = "Activities"
            const val ActivityStock = "Activity stock"
            const val ActivityStock_In_Fsn = "Activity Stock In Fsn"
            const val ActivityStockIN = "Activity stockin"
            const val ActivityStockOUt = "Activity stockout"
            const val Audit_phase = "Audit Phase"
            const val ActivityDashboard = "Activity Dashboard"
            const val Products = "Products"
            const val FSNList = "FSNs"
            const val KRSAllocation = "ARS Allocation"
            const val FeedBack = "Feedback"
            const val WinnerDetails = "Winner Details"
            const val WinnerList = "Winners List"
            const val WinnerVerify = "Winner Verify"
            const val DashboardMain = "Dash"
            const val AboutNewPager = "page"
            const val SALES = "sales"
            const val OPTIONS = "OPTIONS"
            const val Map = "Map"
            const val ProductSelection = "ProductSelection"
            const val TPR = "TPR Pricing"
            const val EOD = "EOD Checklist"
            const val SOD = "SOD Checklist"
            const val TPR2 = "TPR" // String OPTIONS ="Menu" ;
        }
    }

    interface PreferenceConstants {
        companion object {
            const val Shared_Reach_Link = "shared reach link"
            const val MIN_DATE_NON_DSN = "mon date non dsn"
            const val DEVICE = "DEVICE"
            const val UPDATEURI = "UPDATEURI"
            const val DeviceInfo = "DeviceInfo"

            // Login related
            const val USER_NAME = "username"
            const val USER_ID = "id"
            const val TOKEN = "token"
            const val USER_PASSWORD = "password"
            const val REG_ID = "Device_id"
            const val STATUS = "status"
            const val FIRST_NAME = "fname"
            const val POINTS = "points"
            const val LAST_NAME = "lname"
            const val TIER = "tier"
            const val UNIQUE_CODE = "uniquecode"
            const val ADDRESS_ONE = "add1"
            const val ADDRESS_TWO = "add2"
            const val CITY = "city"
            const val PINCODE = "pincode"
            const val LANDMARK = "landmark"
            const val STATE = "state"
            const val MOBILE = "mobile"
            const val Product = "Product"
            const val ATTENDANCE_LAST_DATE = "attendDate"
            const val ATTENDANCE_LAST_TIME = "attendTime"
            const val ATTENDANCE_STATUS = "attendanceStatus"
            const val STORE_LATITUDE = "store_lat"
            const val STORE_LONGITUDE = "store_long"
            const val STORE_ID = "store_id"
            const val STORE_NAME = "store"
            const val STORE_AddE = "store_long"
            const val MTD = "MTD"
            const val FULLDAY = "full_day"
            const val HALFDAY = "half_day"
            const val WEEKOFF = "week_off"
            const val CURRENTDATE = "current_date"
            const val PERCENTAGE = "percentage"
            const val ChangePasswordRequired = "ChangePasswordRequired"
            const val SENT_TOKEN_TO_SERVER = "sentTokenToServer"
            const val FCM_TOKEN = "FCMToken"
            const val NOTI_COUNT = "NotiCount"
            const val THEME = "THEME"
            const val Time = "Time"
            const val Role = "Role" //String USER_Type="USER_Type";
        }
    }

    interface AuditPhase {
        companion object {
            const val Attract = "Attract"
            const val Discoverability = "Discoverability"
            const val Promoter = "Promoter"
            const val LiveDevice = "Live Device"
            const val OfferAndPromotions = "Offer and Promotions"
        }
    }

    interface StringConstants {
        companion object {
            const val CheckList = "   Checklist"
            const val AreArsAttendance = "   ARE/ARS Attendance"
            const val BeatPlan = "   BeatPlan"
            const val Other = "   Other"
            const val ARG_COLUMN_COUNT = "column-count"
            const val JSON = "json"
            const val TAG = "tag"
            const val Header = "header"
            const val URL = "url"
            const val H1 = "H1"
            const val H2 = "H2"
            const val H3 = "H3"
            const val H4 = "H4"
            const val H5 = "H5"
            const val Role = "am"
            const val ReviewTicket = "Review Ticket"
            const val ViewTicket = "View Ticket"
            const val DashboardBeatFragment = "   Beat plan"
            const val DashboardTargetAchieveFragment = "   Target v/s Achievement"
            const val DashboardAttendanceFragment = "   ARE/ARS Attendance"
            const val DashboardTicketFragment = "   Ticket"
            const val DashboardSalesTargetFragment = "   ARE/ARS/DAM Sales"
            const val Leaves = "Leaves"
            const val Attendance = "Attendance"
            const val Allocation = "Allocation"
            const val NewMOM = "MOM"
            const val Walkins = "Walkins"
            const val KrsAllocation = "ARS Allocation"
            const val Store = "Store"
            const val kre = "ARE"
            const val Display = "Display"
            const val MAp = "   Beat Map"
            const val ARE = "ARE"
            const val ARE2 = "ARE Sales"
            const val ARE3 = "ARE ID "
            const val ARE4 = "ARE Name"
            const val ARE5 = "No ARE Data found"
            const val ARE6 = "Select to allocate SP from one store to another"
            const val ARS = "ARS"
            const val DAM = "DAM"
            const val ARE9 = "ARE"
            const val ARE11 = "ARE"
            const val ARE12 = "ARE"
            const val ARE13 = "ARE"
            const val ARE14 = "ARE"
            const val ARE15 = "ARE"
            const val ARE16 = "ARE"
            const val ARE17 = "ARE"
            const val ARE18 = "ARE"
            const val ARE19 = "ARE"
        }
    }

    companion object {
        const val EncryKey = "6753598754127645"
        const val tokenKey = "rEDeMptIon"
        const val EQUAL = "="
        const val AMPERSAND = "&"
        val limitedDeviceInfo = StringBuffer()
        const val MapApiKey = "AIzaSyAAhm-FRxP9peagWiNkHCMJy4PSQgGFSsQ"
        const val KeyToken = "jH4kB2aUDXF2OVp" //"t3Qo7xfdH1";
        const val UsertypeAM = "am"
        const val UsertypeRT = "route_trainer"
        const val usertypeDAm = "dam"
        const val usertypeARS = "ars"
        const val ERRORCODE = "0"
        const val SUCCESSCODE = "1"
        const val SUCCESSMSGCODE = "2"
        const val AUTHFAILURECODE = "-1"
        const val baseUrl = "http://addes.xyz/testing/api/"
        const val UpdateApk = "http://addes.xyz/testing/app/am.apk"
        const val UpdateVersion = "http://addes.xyz/testing/app/am_version.txt"

        //     String baseUrl = "https://addes.in/api/";
        //     String UpdateApk = "https://addes.in/app/am.apk";
        //     String UpdateVersion = "https://addes.in/app/am_version.txt";
        const val APP_TERMS_AND_CONDITION_LOGIN =
            "https://addes.in/assets/data/Amazon_User_Terms.pdf"
        const val faqURL = "https://addes.in/faq_am.html"
        const val STOCKACCESSARIES = "accessories"
        const val STOCKDEVICE = "device"
        const val sod = "{\n" +
                "  \"message\":\"msg\",\n" +
                "  \"status\":\"1\",\n" +
                "  \"data\":[\n" +
                " \n" +
                "\n" +
                "  { \n" +
                "     \"isRequired\":\"1\",\n" +
                "     \"dependent\":\"2\",\n" +
                "    \"no\":\"1\",\"ques\":\"ques1\",\n" +
                "    \"type\":\"radiobtn\",\n" +
                "    \"options\":[\"jio\",\"airtel\",\"voda\"],\n" +
                "    \"option_type\":\"single\",\n" +
                "    \"other\":\"\"\n" +
                "\n" +
                "  },\n" +
                "  {\n" +
                "     \"dependent\":\"2\",\n" +
                " \"isRequired\":\"1\",\n" +
                "     \"no\":\"2\", \"ques\":\"ques2\",\n" +
                "    \"type\":\"checkbox\",\n" +
                "    \"options\":[\"jio\",\"airtel\",\"voda\"],\n" +
                "    \"option_type\":\"number\",\n" +
                "    \"other\":\"\"\n" +
                "\n" +
                "   },\n" +
                "  {\n" +
                "     \"dependent\":\"2\",\n" +
                " \"isRequired\":\"1\",\n" +
                "     \"no\":\"3\", \"ques\":\"ques2\",\n" +
                "    \"type\":\"edittext\",\n" +
                "    \"options\":[],\n" +
                "    \"option_type\":\"number\",\n" +
                "    \"other\":\"\"\n" +
                "\n" +
                "   },\n" +
                "  {\n" +
                "     \"dependent\":\"2\",\n" +
                " \"isRequired\":\"1\",\n" +
                "    \"no\":\"4\",  \"ques\":\"ques3\",\n" +
                "    \"type\":\"pic\",\n" +
                "    \"options\":[],\n" +
                "    \"option_type\":\"\",\n" +
                "    \"other\":\"\"\n" +
                "\n" +
                "   },\n" +
                "  {\n" +
                "     \"dependent\":\"2\",\n" +
                " \"isRequired\":\"1\",\n" +
                "     \"no\":\"5\", \"ques\":\"ques4\",\n" +
                "    \"type\":\"model\",\n" +
                "    \"options\":[],\n" +
                "    \"option_type\":\"\",\n" +
                "    \"other\":\"\"\n" +
                "\n" +
                "   }\n" +
                ",\n" +
                "  {\n" +
                "     \"dependent\":\"2\",\n" +
                " \"isRequired\":\"1\",\n" +
                "     \"no\":\"6\", \"ques\":\"ques4\",\n" +
                "    \"type\":\"modelWithQty\",\n" +
                "    \"options\":[],\n" +
                "    \"option_type\":\"\",\n" +
                "    \"other\":\"\"\n" +
                "\n" +
                "   },\n" +
                "\n" +
                " { \n" +
                " \"isRequired\":\"1\",\n" +
                "     \"dependent\":\"2\",\n" +
                "    \"no\":\"7\",\"ques\":\"ques1\",\n" +
                "    \"type\":\"radiobtn\",\n" +
                "    \"options\":[\"jio\",\"airtel\",\"voda\"],\n" +
                "    \"option_type\":\"single\",\n" +
                "    \"other\":\"\"\n" +
                "\n" +
                "  },\n" +
                "  {\n" +
                "     \"dependent\":\"2\",\n" +
                " \"isRequired\":\"1\",\n" +
                "     \"no\":\"8\", \"ques\":\"ques2\",\n" +
                "    \"type\":\"checkbox\",\n" +
                "    \"options\":[\"jio\",\"airtel\",\"voda\"],\n" +
                "    \"option_type\":\"number\",\n" +
                "    \"other\":\"\"\n" +
                "\n" +
                "   },\n" +
                "  {\n" +
                "     \"dependent\":\"2\",\n" +
                " \"isRequired\":\"1\",\n" +
                "     \"no\":\"9\", \"ques\":\"ques2\",\n" +
                "    \"type\":\"edittext\",\n" +
                "    \"options\":[],\n" +
                "    \"option_type\":\"number\",\n" +
                "    \"other\":\"\"\n" +
                "\n" +
                "   },\n" +
                "  {\n" +
                "     \"dependent\":\"2\",\n" +
                " \"isRequired\":\"1\",\n" +
                "    \"no\":\"10\",  \"ques\":\"ques3\",\n" +
                "    \"type\":\"pic\",\n" +
                "    \"options\":[],\n" +
                "    \"option_type\":\"\",\n" +
                "    \"other\":\"\"\n" +
                "\n" +
                "   },\n" +
                "  {\n" +
                "     \"dependent\":\"2\",\n" +
                " \"isRequired\":\"1\",\n" +
                "     \"no\":\"11\", \"ques\":\"ques4\",\n" +
                "    \"type\":\"model\",\n" +
                "    \"options\":[],\n" +
                "    \"option_type\":\"\",\n" +
                "    \"other\":\"\"\n" +
                "\n" +
                "   }\n" +
                ",\n" +
                "  {\n" +
                "     \"dependent\":\"2\",\n" +
                "    \"isRequired\":\"2\",\n" +
                "     \"no\":\"12\", \"ques\":\"ques4\",\n" +
                "    \"type\":\"modelWithQty\",\n" +
                "    \"options\":[],\n" +
                "    \"option_type\":\"\",\n" +
                "    \"other\":\"\"\n" +
                "\n" +
                "   }\n" +
                "\n" +
                "\n" +
                " ]\n" +
                "}"
        const val questionJSON = "[" +
                "{\"q\":\"Is GSB available?\",\"phase\":\"Attract\",\"label\":\"yes\",\"pic\":\"true\",\"points\":\"2.5\",\"end\":\"false\"}," +
                "{\"q\":\"Is Flange available?\",\"phase\":\"Attract\",\"label\":\"yes\",\"pic\":\"true\",\"points\":\"2.5\",\"end\":\"false\"}," +
                "{\"q\":\"Is Standee available?\",\"phase\":\"Attract\",\"label\":\"yes\",\"pic\":\"true\",\"points\":\"2.5\",\"end\":\"false\"}," +
                "{\"q\":\"Glass branding available?\",\"phase\":\"Attract\",\"label\":\"yes\",\"pic\":\"true\",\"points\":\"2.5\",\"end\":\"false\"}," +
                "{\"q\":\"Any other visibility element?\",\"phase\":\"Attract\",\"label\":\"yes\",\"pic\":\"true\",\"points\":\"2.5\",\"end\":\"true\"}," +
                "{\"q\":\"Is it available in first 3 rows?\",\"phase\":\"Discoverability\",\"label\":\"yes\",\"pic\":\"true\",\"points\":\"0\",\"end\":\"false\"}," +
                "{\"q\":\"Is it available in front of the row or back of the row?\",\"phase\":\"Discoverability\",\"label\":\"front\",\"pic\":\"false\",\"points\":\"20\",\"end\":\"false\"}," +
                "{\"q\":\"Is it available in 4-6 numbered rows?\",\"phase\":\"Discoverability\",\"label\":\"yes\",\"pic\":\"true\",\"points\":\"0\",\"end\":\"false\"}," +
                "{\"q\":\"Is it available in front of the row or back of the row?\",\"phase\":\"Discoverability\",\"label\":\"front\",\"pic\":\"false\",\"points\":\"10\",\"end\":\"false\"}," +
                "{\"q\":\"Is it available in first >6 numbered row?\",\"phase\":\"Discoverability\",\"label\":\"yes\",\"pic\":\"true\",\"points\":\"0\",\"end\":\"false\"}," +
                "{\"q\":\"is it available in front of the row or back of the row?\",\"phase\":\"Discoverability\",\"label\":\"front\",\"pic\":\"false\",\"points\":\"0\",\"end\":\"true\"}," +
                "{\"q\":\"Promoter hygiene- well groomed\",\"phase\":\"Promoter\",\"label\":\"yes\",\"pic\":\"true\",\"points\":\"0\",\"end\":\"false\"}," +
                "{\"q\":\"Promoter wearing uniform?\",\"phase\":\"Promoter\",\"label\":\"yes\",\"pic\":\"true\",\"points\":\"0\",\"end\":\"true\"}," +
                "{\"q\":\"Are 2 Devices charged and working?\",\"phase\":\"Live Device\",\"label\":\"yes\",\"pic\":\"true\",\"points\":\"5\",\"end\":\"false\"}," +
                "{\"q\":\"Are 2 Devices deployed on fixture with Security System?\",\"phase\":\"Live Device\",\"label\":\"yes\",\"pic\":\"true\",\"points\":\"5\",\"end\":\"false\"}," +
                "{\"q\":\"Is security system fully working?\",\"phase\":\"Live Device\",\"label\":\"yes\",\"pic\":\"false\",\"points\":\"5\",\"end\":\"false\"}," +
                "{\"q\":\"Is look and feel of fixture OK? (no repair needed)\",\"phase\":\"Live Device\",\"label\":\"yes\",\"pic\":\"true\",\"points\":\"5\",\"end\":\"false\"}," +
                "{\"q\":\"Are all lights in fixture working?\",\"phase\":\"Live Device\",\"label\":\"yes\",\"pic\":\"true\",\"points\":\"5\",\"end\":\"false\"}," +
                "{\"q\":\"Are all accessories stock merchandised, no hook empty?\",\"phase\":\"Live Device\",\"label\":\"yes\",\"pic\":\"true\",\"points\":\"5\",\"end\":\"true\"}," +
                "{\"q\":\"Is the audit day during the TPR?\",\"phase\":\"Offer and Promotions\",\"label\":\"yes\",\"pic\":\"two\",\"points\":\"10\",\"end\":\"false\"}," +
                "{\"q\":\"Click pic of Comparison leaflets\",\"phase\":\"Offer and Promotions\",\"label\":\"yes\",\"pic\":\"true\",\"points\":\"5\",\"end\":\"false\"}," +
                "{\"q\":\"Click pic of 2 Price tags of live devices\",\"phase\":\"Offer and Promotions\",\"label\":\"yes\",\"pic\":\"two\",\"points\":\"5\",\"end\":\"true\"}," +
                "]"
    }
}