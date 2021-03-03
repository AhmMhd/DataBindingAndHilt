package com.abdulhakeem.databindingandhilt

import android.app.Application
import androidx.databinding.DataBindingUtil
import com.abdulhakeem.databindingandhilt.di.BindingComponentBuilder
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject
import javax.inject.Provider

@HiltAndroidApp
class AppClass : Application(){

    @Inject
    lateinit var bindingComponentProvider: Provider<BindingComponentBuilder>

    override fun onCreate() {
        super.onCreate()
        DataBindingUtil.setDefaultComponent(bindingComponentProvider.get().build())

    }
}