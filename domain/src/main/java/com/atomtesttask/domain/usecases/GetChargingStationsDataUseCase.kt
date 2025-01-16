package com.atomtesttask.domain.usecases

import com.atomtesttask.domain.model.ChargingStationsModel
import com.atomtesttask.domain.repository.IRepository

class GetChargingStationsDataUseCase(private val repository: IRepository) {
    suspend fun getChargingStationsData(): Result<List<ChargingStationsModel>> = repository.getChagingStationsData()
}