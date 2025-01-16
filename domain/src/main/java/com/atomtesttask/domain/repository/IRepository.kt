package com.atomtesttask.domain.repository

import com.atomtesttask.domain.model.ChargingStationsModel

interface IRepository {
    suspend fun getChagingStationsData(): Result<List<ChargingStationsModel>>
}