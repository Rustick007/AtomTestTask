package com.atomtesttask.di.usecases

import com.atomtesttask.domain.repository.IRepository
import com.atomtesttask.domain.usecases.GetChargingStationsDataUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class GetChargingStationsUseCaseModule {
    @Provides
    @Singleton
    fun provideGetChargingStationsDataUseCase(repository: IRepository) = GetChargingStationsDataUseCase(
        repository = repository,
    )
}

