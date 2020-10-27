package com.triad.mvvmlearning.utility

import android.app.ProgressDialog
import android.content.ContentValues
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.net.ConnectivityManager
import android.net.Uri
import android.os.Build
import android.provider.MediaStore
import android.provider.Settings
import android.provider.Settings.SettingNotFoundException
import android.text.TextUtils
import android.util.Base64
import android.util.Log
import android.util.Patterns
import android.view.View
import android.view.inputmethod.InputMethodManager
import com.google.android.material.snackbar.Snackbar
import java.io.File
import java.net.URI
import java.net.URISyntaxException
import java.security.*
import java.security.spec.PKCS8EncodedKeySpec
import java.security.spec.X509EncodedKeySpec
import java.text.DateFormat
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*
import java.util.regex.Matcher
import java.util.regex.Pattern
import javax.crypto.Cipher
import javax.crypto.spec.SecretKeySpec

/**
 * Created by Raman on 15-07-2018.
 */
object UtilityMethods {

    var pd: ProgressDialog? = null

    /**
     *
     * 1 byte = 0.0078125 kilobits
     * 1 kilobits = 0.0009765625 megabit
     *
     * @param downloadTime in miliseconds
     * @param bytesIn number of bytes downloaded
     * @return SpeedInfo containing current speed
     */
    fun calculate(downloadTime: Long, bytesIn: Long): SpeedInfo {
        //  double EDGE_THRESHOLD = 176.0;
        val BYTE_TO_KILOBIT = 0.0078125
        val KILOBIT_TO_MEGABIT = 0.0009765625
        val info = SpeedInfo()
        val bytespersecond = bytesIn * 1000 / downloadTime.toDouble()
        val kilobits = bytespersecond * BYTE_TO_KILOBIT
        megabits = kilobits * KILOBIT_TO_MEGABIT
        info.downspeed = bytespersecond
        info.kilobits = kilobits
        info.megabits = megabits
        return info
    }

    var megabits = 0.0
    fun setTokenValue(token: String) {
        var tokenVal = ""
        val year =
            Calendar.getInstance()[Calendar.YEAR].toString()
        tokenVal = year + Constants.KeyToken + token
        PreferenceConfigration.setPreference(
            Constants.PreferenceConstants.TOKEN,
            tokenVal
        )
    }

    fun parseDateTimeTohmma(time: String?): String? {
        val inputPattern = "yyyy-MM-dd hh:mm:ss"
        val outputPattern = "h:mm a"
        val inputFormat = SimpleDateFormat(inputPattern)
        val outputFormat = SimpleDateFormat(outputPattern)
        var date: Date? = null
        var str: String? = null
        try {
            date = inputFormat.parse(time)
            str = outputFormat.format(date)
        } catch (e: ParseException) {
            e.printStackTrace()
        }
        return str
    }

    fun parseDateTimeTodMMMyyyy(time: String?): String? {
        val inputPattern = "yyyy-MM-dd hh:mm:ss"
        val outputPattern = "d MMM yyyy"
        val inputFormat = SimpleDateFormat(inputPattern)
        val outputFormat = SimpleDateFormat(outputPattern)
        var date: Date? = null
        var str: String? = null
        try {
            date = inputFormat.parse(time)
            str = outputFormat.format(date)
        } catch (e: ParseException) {
            e.printStackTrace()
        }
        return str
    }

    fun parseDateTimeTodMMMyyyy2(time: String?): String? {
        val inputPattern = "yyyy-MM-dd"
        val outputPattern = "d MMM yy"
        val inputFormat = SimpleDateFormat(inputPattern)
        val outputFormat = SimpleDateFormat(outputPattern)
        val date: Date
        var str: String? = null
        try {
            date = inputFormat.parse(time)
            str = outputFormat.format(date)
        } catch (e: ParseException) {
            e.printStackTrace()
        }
        return str
    }

    fun emailValidator(email: String?): Boolean {
        val pattern: Pattern
        val matcher: Matcher
        val EMAIL_PATTERN =
            "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"
        pattern = Pattern.compile(EMAIL_PATTERN)
        matcher = pattern.matcher(email)
        return matcher.matches()
    }

    fun isMockSettingsON(context: Context): Boolean {
        // returns true if mock location enabled, false if not enabled.
        return if (Settings.Secure.getString(
                context.contentResolver,
                Settings.Secure.ALLOW_MOCK_LOCATION
            ) == "0"
        ) false else true
    }

    fun getFileNameByUri(context: Context, uri: Uri): String? {
        var filepath: String? = "" //default fileName
        //Uri filePathUri = uri;
        val file: File
        if (uri.scheme.toString().compareTo("content") == 0) {
            val cursor = context.contentResolver.query(
                uri,
                arrayOf(
                    MediaStore.Images.ImageColumns.DATA,
                    MediaStore.Images.Media.ORIENTATION
                ),
                null,
                null,
                null
            )
            val column_index = cursor!!.getColumnIndexOrThrow(MediaStore.Images.Media.DATA)
            cursor.moveToFirst()
            val mImagePath = cursor.getString(column_index)
            cursor.close()
            filepath = mImagePath
        } else if (uri.scheme!!.compareTo("file") == 0) {
            try {
                file = File(URI(uri.toString()))
                if (file.exists()) filepath = file.absolutePath
            } catch (e: URISyntaxException) {
                // TODO Auto-generated catch block
                e.printStackTrace()
            }
        } else {
            filepath = uri.path
        }
        return filepath
    }

    fun DPIoffset(context: Context): Float {
        val metrics = context.resources.displayMetrics
        val densityDpi = (metrics.density * 160f).toInt()
        var offset = 0f
        offset = if (densityDpi <= 300) {
            1f
        } else {
            (0.01 * (densityDpi - 300) + 1).toFloat()
        }
        return offset
    }

    fun sendSMS(message: String, context: Context) {


//        JSONObject jsonbody = null;
//        try {
//            jsonbody = new JSONObject();
//            jsonbody.put("fsn", message);
////            jsonbody.put("device", PreferenceConfigration.getPreference(Constants.PreferenceConstants.DEVICE));
////            jsonbody.put("token", PreferenceConfigration.getPreference(Constants.PreferenceConstants.TOKEN));
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        val intent =
            Intent(Intent.ACTION_VIEW, Uri.parse("sms:" + "9200003232"))
        intent.putExtra("sms_body", "AMZKDL $message")
        context.startActivity(intent)
    }

    private val snackBar: Snackbar? = null
    var isSnackBarVisible = false
    private const val lastMsg = ""
    fun getVersionCode(context: Context): Int {
        val pm = context.packageManager
        try {
            val pi = pm.getPackageInfo(context.packageName, 0)
            return pi.versionCode
        } catch (ex: PackageManager.NameNotFoundException) {
        }
        return 0
    }

    fun hideKeyboard(context: Context, view: View) {
        // hide virtual keyboard
        val imm =
            context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(
            view.windowToken,
            InputMethodManager.RESULT_UNCHANGED_SHOWN
        )
    }

    val timeStamp: String
        get() = Date().time.toString()

    fun makeRequestURL(values: ContentValues): String {
        val builder = StringBuilder()
        builder.append("url")
        val valueSet =
            values.valueSet()
        for ((key, value1) in valueSet) {
            try {
                // Object v = URLEncoder.encode(value.getValue().toString(), "utf-8");
                builder.append(key)
                builder.append(Constants.EQUAL)
                builder.append(value1.toString())
                builder.append(Constants.AMPERSAND)
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
        return builder.toString()
    }

    fun generateDSAKey(): KeyPair? {
        var pair: KeyPair? = null
        try {
            val keyGen = KeyPairGenerator
                .getInstance("DSA", "SUN")
            val random =
                SecureRandom.getInstance("SHA1PRNG", "SUN")
            keyGen.initialize(1024, random)
            pair = keyGen.generateKeyPair()
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return pair
    }

    fun generateRSAKey(): KeyPair? {
        val kpg: KeyPairGenerator
        var kp: KeyPair? = null
        try {
            kpg = KeyPairGenerator.getInstance("RSA")
            kpg.initialize(2048)
            kp = kpg.genKeyPair()
        } catch (e: NoSuchAlgorithmException) {
            e.printStackTrace()
        }
        return kp
    }

    fun encryptRSA(msg: ByteArray?, pubKey: PublicKey?): ByteArray? {
        var cipherData: ByteArray? = null
        try {
            val cipher = Cipher.getInstance("RSA")
            cipher.init(Cipher.ENCRYPT_MODE, pubKey)
            cipherData = cipher.doFinal(msg)
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return cipherData
    }

    fun decryptRSA(msg: ByteArray?, priKey: PrivateKey?): ByteArray? {
        var cipherData: ByteArray? = null
        try {
            val cipher = Cipher.getInstance("RSA")
            cipher.init(Cipher.DECRYPT_MODE, priKey)
            cipherData = cipher.doFinal(msg) //Base64.decode(msg, Base64.DEFAULT));
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return cipherData
    }

    private fun decodePublicKey(publicKeyString: String): PublicKey? {
        var publicKey: PublicKey? = null
        var kf: KeyFactory? = null
        try {
            kf = KeyFactory.getInstance("RSA")
            val encodedPb = Base64.decode(
                publicKeyString,
                Base64.DEFAULT
            ) //Base64.decodeBase64(publicKeyString);
            val keySpecPb =
                X509EncodedKeySpec(encodedPb)
            publicKey = kf.generatePublic(keySpecPb)
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return publicKey
    }

    private fun decodePrivateKey(publicKeyString: String): PrivateKey? {
        var privateKey: PrivateKey? = null
        var kf: KeyFactory? = null
        try {
            kf = KeyFactory.getInstance("RSA")
            val encodedPb = Base64.decode(
                publicKeyString,
                Base64.DEFAULT
            ) //Base64.decodeBase64(publicKeyString);
            val keySpecPb =
                X509EncodedKeySpec(encodedPb)
            privateKey = kf.generatePrivate(keySpecPb)
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return privateKey
    }

//    @Throws(GeneralSecurityException::class)
//    fun loadPrivateKey(key64: String?): PrivateKey {
//        val clear = Base64.decode(key64, Base64.DEFAULT)
//        val keySpec =
//            PKCS8EncodedKeySpec(clear)
//        val fact = KeyFactory.getInstance("RSA")
//        val priv = fact.generatePrivate(keySpec)
//        Arrays.fill(clear, 0.toByte())
//        return priv
//    }

//    @Throws(GeneralSecurityException::class)
//    fun loadPublicKey(stored: String?): PublicKey {
//        val data = Base64.decode(stored, Base64.DEFAULT)
//        val spec =
//            X509EncodedKeySpec(data)
//        val fact = KeyFactory.getInstance("RSA")
//        return fact.generatePublic(spec)
//    }
//
//    @Throws(GeneralSecurityException::class)
//    fun savePrivateKey(priv: PrivateKey?): String {
//        val fact = KeyFactory.getInstance("RSA")
//        val spec =
//            fact.getKeySpec(
//                priv,
//                PKCS8EncodedKeySpec::class.java
//            )
//        val packed = spec.encoded
//        val key64 =
//            String(Base64.encode(packed, Base64.DEFAULT))
//        Arrays.fill(packed, 0.toByte())
//        return key64
//    }
//
//    @Throws(GeneralSecurityException::class)
//    fun savePublicKey(publ: PublicKey?): String {
//        val fact = KeyFactory.getInstance("RSA")
//        val spec =
//            fact.getKeySpec(
//                publ,
//                X509EncodedKeySpec::class.java
//            )
//        return String(Base64.encode(spec.encoded, Base64.DEFAULT))
//    }


    var pri =
        "OpenSSLDSAPrivateKey{X=1f35a7314321be52452328ea6e89da34008fe9e7,params=OpenSSLDSAParams{G=8cc95f65aa33e775951cb70fd635b5388ebd3e96580cfbab7e0a8acd205f3637df36d8910875def5d0f7d17ed487993dd126488b6737f5a4c0ab12a18ae7b97a1929e1773cc629c5917167e79b15ec163d7ce62b569e5297db87f0f964dd2cd57cabec5d2528f6425435ebf59b802494fdf91aeb54b96e37f99e23020ba37548,P=c72c1f7dd70e97ad51eb0d1612b4249d160dc4e8f880b5b4abbaec237a50035402fb9f6fdddff8cd94b4eb186cef9c6963dce6874052ea48966aad2f89b562876488b1cab9c82eae8f0105dcdaf7ecdffee4cb79e07c6ed896a116d1c8ff0d41b143c7d42d0f9fa9084d6ca5b2f28540d9cb8421649d5f38acf0f5fdafcabbff,Q=80fb93c11b844b18ab9cc1ed55ff4ec750c2db55"
    var pub =
        "OpenSSLDSAPublicKey{Y=67f9f76dff7fd8d84ab8d8fa5b38c060722ed12e3eb940286bda0aaad25ca310d77c7ac4861bdd531b399f8827921131745902ebc9e4d2c6ca110d71f97d3bcb5cb4a8a28af3cc049efd0b1517867bf1301bbbb2b300588182f22d4b0e40211d4f46082adccc9415c9b11839c2615d81b770ba80012fcbee8c8c939de05610fd,params=OpenSSLDSAParams{G=8cc95f65aa33e775951cb70fd635b5388ebd3e96580cfbab7e0a8acd205f3637df36d8910875def5d0f7d17ed487993dd126488b6737f5a4c0ab12a18ae7b97a1929e1773cc629c5917167e79b15ec163d7ce62b569e5297db87f0f964dd2cd57cabec5d2528f6425435ebf59b802494fdf91aeb54b96e37f99e23020ba37548,P=c72c1f7dd70e97ad51eb0d1612b4249d160dc4e8f880b5b4abbaec237a50035402fb9f6fdddff8cd94b4eb186cef9c6963dce6874052ea48966aad2f89b562876488b1cab9c82eae8f0105dcdaf7ecdffee4cb79e07c6ed896a116d1c8ff0d41b143c7d42d0f9fa9084d6ca5b2f28540d9cb8421649d5f38acf0f5fdafcabbff,Q=80fb93c11b844b18ab9cc1ed55ff4ec750c2db55"

    fun rsaencrypt(input: String): String {
        val crypted: ByteArray? = null
        try {
//            SecretKeySpec skey = new SecretKeySpec(pri.getBytes(), "DSA");
//            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
//            cipher.init(Cipher.ENCRYPT_MODE, skey);
//            crypted = cipher.doFinal(input.getBytes());
            val cipher = Cipher.getInstance("RSA")
            //    cipher.init(Cipher.ENCRYPT_MODE, pub);
            val d = cipher.doFinal(input.toByteArray())


            // new String(Base64.encodeToString(crypted, Base64.DEFAULT).replace("\n", ""));
            val skey2 =
                SecretKeySpec(pub.toByteArray(), "DSA")
            cipher.init(Cipher.DECRYPT_MODE, skey2)
            val output =
                cipher.doFinal(Base64.decode(d, Base64.DEFAULT))
            val dd = String(output)
        } catch (e: Exception) {
            println(e.toString())
        }
        return ";"
    }

    @JvmStatic
    fun encrypt(input: String?): String {
        var crypted: ByteArray? = null
        try {
            val skey = SecretKeySpec(
                Constants.EncryKey.toByteArray(),
                "AES"
            )
            val cipher =
                Cipher.getInstance("AES/ECB/PKCS5Padding")
            cipher.init(Cipher.ENCRYPT_MODE, skey)
            if (input != null) {
                crypted = cipher.doFinal(input.toByteArray())
            }else{
                return  "";
            }
        } catch (e: Exception) {
            println(e.toString())
        }

        var code : String
        code = Base64.encodeToString(crypted, Base64.DEFAULT)
            .replace("\n", "")


        return code
    }

    @JvmStatic
    fun decrypt(input: String?): String {
        var output: ByteArray? = null
        try {
            val skey = SecretKeySpec(
                Constants.EncryKey.toByteArray(),
                "AES"
            )
            val cipher =
                Cipher.getInstance("AES/ECB/PKCS5Padding")
            cipher.init(Cipher.DECRYPT_MODE, skey)
            output = cipher.doFinal(Base64.decode(input, Base64.DEFAULT))
        } catch (e: Exception) {
            println(e.toString())
        }
        return output?.let { String(it) } ?: ""
    }

    //    public static String getCurrentDate() {
    //        Calendar c = Calendar.getInstance();
    //        int day = c.get(Calendar.DAY_OF_MONTH);
    //        int month = c.get(Calendar.MONTH) + 1;
    //        int year = c.get(Calendar.YEAR);
    //        String currentDate = Integer.toString(day) + "-" + Integer.toString(month) + "-" + Integer.toString(year);
    //        return currentDate;
    //    }
    fun formateDateFromstring(
        inputFormat: String?,
        outputFormat: String?,
        inputDate: String?
    ): String {
        var parsed: Date? = null
        var outputDate = ""
        val df_input =
            SimpleDateFormat(inputFormat, Locale.getDefault())
        val df_output =
            SimpleDateFormat(outputFormat, Locale.getDefault())
        try {
            parsed = df_input.parse(inputDate)
            outputDate = df_output.format(parsed)
        } catch (e: ParseException) {
            Log.e("", "ParseException - dateFormat")
        }
        return outputDate
    }

    fun isNetworkAvailable(context: Context): Boolean {
        val conMan = context
            .getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val activeNetworkInfo = conMan.activeNetworkInfo
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected) { // connected to the internet
            // Toast.makeText(context, activeNetworkInfo.getTypeName(), Toast.LENGTH_SHORT).show();
            if (activeNetworkInfo.type == ConnectivityManager.TYPE_WIFI) {
                // connected to wifi
                return true
            } else if (activeNetworkInfo.type == ConnectivityManager.TYPE_MOBILE) {
                // connected to the mobile provider's data plan
                return true
            }
        }
        return false
        /* if (conMan.getActiveNetworkInfo() != null
                && conMan.getActiveNetworkInfo().isConnected())
            return true;
        else
            return false;*/
    }

    fun tokenValue(): String {
        var tokenVal = ""
        val year =
            Calendar.getInstance()[Calendar.YEAR].toString()
        // tokenVal = year+"t3Qo7xfdH1"+PreferenceConfigration.getPreference(Constants.PreferenceConstants.TOKEN);
        tokenVal =
            year + Constants.KeyToken + PreferenceConfigration.getPreference(
                Constants.PreferenceConstants.TOKEN
            )
        return tokenVal
    }

    /**
     * Validation of Phone Number
     */
    fun isValidPhoneNumber(target: CharSequence?): Boolean {
        return if (target == null) {
            false
        } else {
            if (target.length < 10 || target.length > 10) {
                false
            } else {
                Patterns.PHONE.matcher(target).matches()
            }
        }
    }

    fun isLocationEnabled(context: Context): Boolean {
        var locationMode = 0
        val locationProviders: String
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            try {
                locationMode = Settings.Secure.getInt(
                    context.contentResolver,
                    Settings.Secure.LOCATION_MODE
                )
            } catch (e: SettingNotFoundException) {
                e.printStackTrace()
            }
            locationMode != Settings.Secure.LOCATION_MODE_OFF
        } else {
            locationProviders = Settings.Secure.getString(
                context.contentResolver,
                Settings.Secure.LOCATION_PROVIDERS_ALLOWED
            )
            !TextUtils.isEmpty(locationProviders)
        }
    }

    fun MyTimeConverter(unix: String): String {
        val sdf: DateFormat =
            SimpleDateFormat("dd MMM, yyyy' 'HH:mm:ss", Locale.getDefault())
        sdf.timeZone = TimeZone.getTimeZone("Asia/Calcutta")
        val calendar = Calendar.getInstance()
        calendar.timeInMillis = unix.toLong()
        val tz = TimeZone.getDefault()
        sdf.timeZone = tz
        return sdf.format(calendar.time)
    }

    fun showLoadingDialog(context: Context?, msg: String?) {
        if (pd == null) {
            pd = ProgressDialog(context)
            pd!!.setMessage(msg)
            pd!!.show()
            pd!!.setCancelable(false)
            pd!!.setCanceledOnTouchOutside(false)
        }
    }

    fun dismissLoadingDialog() {
        if (pd != null) {
            pd!!.dismiss()
            pd = null
        }
    }

    /**
     * Transfer Object
     * @author devil
     */
    class SpeedInfo {
        var kilobits = 0.0
        var megabits = 0.0
        var downspeed = 0.0
    }
}