package com.atomtesttask.chargingstationslist.di

import com.atomtesttask.chargingstationslist.navigation.FeatureCharingStationsApi
import com.atomtesttask.chargingstationslist.navigation.FeatureCharingStationsImpl
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
    fun providerFeatureCharingStations(impl: FeatureCharingStationsImpl): FeatureCharingStationsApi =
        impl
}