package com.atomtesttask.citylist.presenter

import com.atomtesttask.citylist.dataprovider.DataProvider
import com.atomtesttask.citylist.models.Constants
import com.atomtesttask.citylist.navigation.FeatureCityListDestinations
import com.atomtesttask.citylist.presenter.FeatureCityListContract.Effect
import com.atomtesttask.citylist.presenter.FeatureCityListContract.Event
import com.atomtesttask.citylist.presenter.FeatureCityListContract.State
import com.atomtesttask.core.base.FeatureViewModel
import com.atomtesttask.domain.usecases.GetChargingStationsDataUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
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
            delay(Constants.digital.l1000)
            getChargingStationsDataUseCase.getChargingStationsData()
                .onSuccess {
                    setState {
                        copy(isLoading = false)
                    }
                    setState {
                        copy(allData = it)
                    }
                    dataProvider.setAllData(it)
                    dataProvider
                        .observeUniqCities()
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
        setListOfUniqCities()
    }

    override fun setInitialState() = State.default()

    override fun onErrorHandler(exception: Throwable) {
        TODO("хэндлер для обработки ошибок")
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
                dataProvider.setChosenCity(event.name)
            }

            is Event.ActionsEvent.GoToSecondScreen -> {
                navigationManager.navigate(
                    FeatureCityListDestinations.Common.ChargerList.getNavigationRoute(
                        FeatureCityListDestinations.Common.CHARGER_LIST_ROUT,
                    )
                )
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