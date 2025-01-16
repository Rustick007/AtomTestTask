package com.atomtesttask.citylist.dataprovider

import com.atomtesttask.domain.model.ChargingStationsModel
import kotlinx.coroutines.flow.StateFlow

interface IDataProvider {

    fun getAllData() : StateFlow<List<ChargingStationsModel>>

    fun setAllData(data: List<ChargingStationsModel>)

    suspend fun observeUniqCities()

    fun getUniqCitiesList() : StateFlow<List<String>>


}