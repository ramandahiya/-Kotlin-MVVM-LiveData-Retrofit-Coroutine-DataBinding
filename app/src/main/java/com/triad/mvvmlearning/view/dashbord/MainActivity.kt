package com.triad.mvvmlearning.view.dashbord

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.triad.mvvmlearning.R
import com.triad.mvvmlearning.databinding.ActivityLoginBinding
import com.triad.mvvmlearning.databinding.ActivityMainBinding
import com.triad.mvvmlearning.databinding.FragmentLoginBinding
import com.triad.mvvmlearning.network.AuthApi
import com.triad.mvvmlearning.repository.LoginRepository
import com.triad.mvvmlearning.view.BaseActivity
import com.triad.mvvmlearning.view.login.LoginViewModel

class MainActivity : BaseActivity<LoginViewModel, ActivityMainBinding, LoginRepository>() {



    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)

        val navView: BottomNavigationView = findViewById(R.id.nav_view)

        val navController = findNavController(R.id.nav_host_fragment)

        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(setOf(
            R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications))

        // setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)

    }



    override fun getViewModel() = LoginViewModel::class.java

    override fun getActivityBinding() : ViewDataBinding {

        return  DataBindingUtil.setContentView(this, R.layout.activity_main);

    }


    override fun getActivityRepository(): LoginRepository {

        return  LoginRepository(remoteDataSource.buildApi(AuthApi::class.java))

    }

}