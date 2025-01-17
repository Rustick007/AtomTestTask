package com.atomtesttask.citylist.dataprovider

import com.atomtesttask.citylist.models.Constants
import com.atomtesttask.domain.model.ChargingStationsModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.flow.map
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
        MutableStateFlow(listOf())

    private val filteresCitiesData: MutableStateFlow<List<ChargingStationsModel>> =
        MutableStateFlow(listOf())

    private val listOfUniqCities: MutableStateFlow<List<String>> =
        MutableStateFlow(listOf())

    private val chosenCity: MutableStateFlow<String> =
        MutableStateFlow(Constants.STRING_EMPTY)

    override fun getAllData(): StateFlow<List<ChargingStationsModel>> = allData
    override fun setAllData(data: List<ChargingStationsModel>) {
        this.allData.update { data }
    }

    override suspend fun observeUniqCities() {
        allData.map { chargingStations ->
            chargingStations.map { it.city }.distinct()
        }
            .distinctUntilChanged()
            .collect {
                listOfUniqCities.value = it
            }
    }

    override fun getUniqCitiesList(): MutableStateFlow<List<String>> {
        return listOfUniqCities
    }

    override suspend fun filterByCity(city: String) {
        allData.map {
            it.filter { chargingStationsModel ->
                chargingStationsModel.city.equals(city, ignoreCase = true)
            }
                .sortedBy { it.charger.name }
        }.collect {
            filteresCitiesData.value = it
        }
    }

    override fun getFilteredByCitiesList(): StateFlow<List<ChargingStationsModel>> {
        return filteresCitiesData
    }

    override fun setChosenCity(city: String) {
        this.chosenCity.update { city }
    }

    override fun getChosenCity(): StateFlow<String> = chosenCity
}