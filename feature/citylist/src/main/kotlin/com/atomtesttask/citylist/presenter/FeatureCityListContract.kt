package com.atomtesttask.citylist.presenter

import com.atomtesttask.citylist.models.AllDataModel
import com.atomtesttask.citylist.models.Constants
import com.atomtesttask.core.base.ViewEvent
import com.atomtesttask.core.base.ViewSideEffect
import com.atomtesttask.core.base.ViewState
import com.atomtesttask.domain.model.ChargingStationsModel

internal class FeatureCityListContract {

    data class State(
        val clickedCity: String,
        val allData: List<ChargingStationsModel>,
        val listOfUniqCities: List<String>
    ) : ViewState {
        companion object {
            fun default() = State(
                clickedCity = Constants.STRING_EMPTY,
                allData = AllDataModel.emptyDataModel(),
                listOfUniqCities = emptyList()
            )
        }
    }

    sealed class Event : ViewEvent {
        sealed class ActionsEvent : Event() {
            data object GoToBack : ActionsEvent()
            class CityClicked(val name: String): ActionsEvent()
            data object GoToSecondScreen : ActionsEvent()
        }

        sealed class ServiceEvent : Event() {
            data object OnLoadData : ServiceEvent()
            class AddUniqCitiesToState(val citiesList: List<String>) : ServiceEvent()
        }
    }

    sealed class Effect : ViewSideEffect
}