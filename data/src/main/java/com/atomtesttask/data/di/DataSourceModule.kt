package com.atomtesttask.data.di

import com.atomtesttask.data.repository.Repository
import com.atomtesttask.domain.repository.IRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
internal interface DataSourceModule {
    @Binds
    fun bindCorpDataSource(repository: Repository): IRepository
}