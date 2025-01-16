package com.atomtesttask.data.datasource

import com.atomtesttask.data.api.ChargingStationsResponse

internal interface IDataSource {
    fun getChagingStationsData(): List<ChargingStationsResponse>?
}