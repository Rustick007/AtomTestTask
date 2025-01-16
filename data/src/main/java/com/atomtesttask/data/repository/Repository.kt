package com.atomtesttask.data.repository

import com.atomtesttask.data.datasource.RemoteDataSourceFactory
import com.atomtesttask.data.mapper.toModel
import com.atomtesttask.domain.model.ChargingStationsModel
import com.atomtesttask.domain.repository.IRepository
import javax.inject.Inject

internal class Repository @Inject constructor(
    private val dataSource: RemoteDataSourceFactory,
) : IRepository {
    override suspend fun getChagingStationsData(): Result<List<ChargingStationsModel>> =
        runCatching {
            dataSource.createRemoteDataSource().getChagingStationsData(
            ).toModel()
        }
}