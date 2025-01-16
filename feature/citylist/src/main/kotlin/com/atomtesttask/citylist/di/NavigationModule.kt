package com.atomtesttask.citylist.di

import com.atomtesttask.citylist.navigation.FeatureCityListApi
import com.atomtesttask.citylist.navigation.FeatureCityListImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class NavigationModule {
    @Provides
    @Singleton
    fun providerFeature(impl: FeatureCityListImpl): FeatureCityListApi = impl
}