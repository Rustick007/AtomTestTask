package com.atomtesttask.citylist.dataprovider

import android.util.Log
import com.atomtesttask.domain.model.ChargingStationsModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.update
import javax.inject.Inject
import javax.inject.Singleton


/**
 *
 * Класс провайдер данных
 *
 */
@Singleton
internal class DataProvider
@Inject
constructor() : IDataProvider {

    private val allData: MutableStateFlow<List<ChargingStationsModel>> =
        MutableStateFlow(emptyList())

    private val listOfUniqCities: MutableStateFlow<MutableList<String>> =
        MutableStateFlow(mutableListOf())

    override fun getAllData(): StateFlow<List<ChargingStationsModel>> = allData
    override fun setAllData(data: List<ChargingStationsModel>) {
        this.allData.update { data }
    }

    override suspend fun observeUniqCities() {
        allData.map { chargingStations ->
            chargingStations.map { it.city }.distinct()
        }
            .distinctUntilChanged()
    }

    override fun getUniqCitiesList(): StateFlow<List<String>> = listOfUniqCities

}