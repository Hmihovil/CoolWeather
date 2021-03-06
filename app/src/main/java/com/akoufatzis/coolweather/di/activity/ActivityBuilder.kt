package com.akoufatzis.coolweather.di.activity

import com.akoufatzis.coolweather.di.scopes.ActivityScope
import com.akoufatzis.coolweather.presentation.main.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface ActivityBuilder {
    @ActivityScope
    @ContributesAndroidInjector(modules = [MainActivityModule::class])
    fun contributeMainActivity(): MainActivity
}
