package com.atomtesttask.citylist.presenter

import com.atomtesttask.chargingstationslist.navigation.FeatureCharingStationsDestinations
import com.atomtesttask.citylist.dataprovider.DataProvider
import com.atomtesttask.citylist.presenter.FeatureCityListContract.Effect
import com.atomtesttask.citylist.presenter.FeatureCityListContract.Event
import com.atomtesttask.citylist.presenter.FeatureCityListContract.State
import com.atomtesttask.core.base.FeatureViewModel
import com.atomtesttask.domain.usecases.GetChargingStationsDataUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import navigation.compose.NavigationManager
import javax.inject.Inject

@HiltViewModel
internal class FeatureCityListViewModel
@Inject
constructor(
    private val navigationManager: NavigationManager,
    private val getChargingStationsDataUseCase: GetChargingStationsDataUseCase,
    private val dataProvider: DataProvider
) : FeatureViewModel<Event, State, Effect>() {

    init {
        setEvent(Event.ServiceEvent.OnLoadData)
        onObservers()
    }

    private fun getData() {
        viewModelScope.launch {
            getChargingStationsDataUseCase.getChargingStationsData()
                .onSuccess {
                    setState {
                        copy(allData = it)
                    }
                    dataProvider
                        .observeUniqCities()
//                    dataProvider
//                        .setAllData(it)
//                    setListOfUniqCities()

                }
                .onFailure { e ->
                    e.printStackTrace()
                }
        }
    }

    private fun setListOfUniqCities() {
        dataProvider
            .getUniqCitiesList()
            .onEach {
                setEvent(Event.ServiceEvent.AddUniqCitiesToState(it))
            }
            .launchIn(viewModelScope)
    }

    private fun onObservers() {

    }

    override fun setInitialState() = State.default()

    override fun onErrorHandler(exception: Throwable) {
        TODO("Not yet implemented")
    }

    override fun handleEvents(event: Event) {
        when (event) {
            is Event.ActionsEvent -> onEventSelected(event)
            is Event.ServiceEvent -> onEventService(event)
        }
    }

    private fun onEventSelected(event: Event.ActionsEvent) {
        when (event) {
            Event.ActionsEvent.GoToBack -> {
                navigationManager.back()
            }

            is Event.ActionsEvent.CityClicked -> {
                setState {
                    copy(clickedCity = event.name)
                }
            }

            is Event.ActionsEvent.GoToSecondScreen -> {
                navigationManager.navigate(FeatureCharingStationsDestinations.Common.COMMON_ROOT_ROUT)
            }
        }
    }

    private fun onEventService(event: Event.ServiceEvent) {
        when (event) {
            is Event.ServiceEvent.OnLoadData -> {
                getData()
            }

            is Event.ServiceEvent.AddUniqCitiesToState -> {
                setState {
                    copy(listOfUniqCities = event.citiesList)
                }
            }
        }
    }
}