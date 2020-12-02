package com.werockstar.dagger2demo.di.component

import com.triad.mvvmlearning.network.RemoteDataSource
import com.triad.mvvmlearning.view.BaseFragment
import com.triad.mvvmlearning.view.dashbord.MainActivity
import com.triad.mvvmlearning.view.dashbord.ui.dashboard.DashboardFragment
import com.triad.mvvmlearning.view.login.LoginFragment
import com.werockstar.dagger2demo.di.module.ActivityModule
import com.werockstar.dagger2demo.di.module.AndroidModule
import com.werockstar.dagger2demo.di.module.ApplicationModule

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ ApplicationModule::class,
    AndroidModule::class,ActivityModule::class])

interface AppComponent {
    fun inject(fragment: MainActivity)

    fun inject(activity: LoginFragment)

    fun inject(fragment: RemoteDataSource)

}