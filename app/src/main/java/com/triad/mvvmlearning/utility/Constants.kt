package com.triad.mvvmlearning.utility

/**
 * Created by Raman on 15-07-2018.
 */
interface Constants {
    interface Url {
        companion object {

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


        }
    }

    interface FragmentTags {
        companion object {

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


    companion object {
        const val EncryKey = "6753598754127645"
        const val tokenKey = "rEDeMptIon"
        const val EQUAL = "="
        const val AMPERSAND = "&"
        val limitedDeviceInfo = StringBuffer()
        const val KeyToken = "jH4kB2aUDXF2OVp" //"t3Qo7xfdH1";

        const val usertypeARS = "ars"
        const val ERRORCODE = "0"
        const val SUCCESSCODE = "1"
        const val SUCCESSMSGCODE = "2"
        const val AUTHFAILURECODE = "-1"
        const val baseUrl = "http://addes.xyz/testing/api/"
        const val UpdateApk = "http://addes.xyz/testing/app/am.apk"
        const val UpdateVersion = "http://addes.xyz/testing/app/am_version.txt"



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