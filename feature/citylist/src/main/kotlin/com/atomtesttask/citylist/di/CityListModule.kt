package com.atomtesttask.citylist.di

import com.atomtesttask.citylist.dataprovider.DataProvider
import com.atomtesttask.citylist.dataprovider.IDataProvider
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal interface CityListModule {
    @Singleton
    @Binds
    fun bindCityListDataProvider(impl: DataProvider): IDataProvider
}