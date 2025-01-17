package com.atomtesttask.citylist.presenter.chargingstations

import com.atomtesttask.citylist.dataprovider.DataProvider
import com.atomtesttask.citylist.presenter.chargingstations.FeatureCharingStationsContract.Effect
import com.atomtesttask.citylist.presenter.chargingstations.FeatureCharingStationsContract.Event
import com.atomtesttask.citylist.presenter.chargingstations.FeatureCharingStationsContract.State
import com.atomtesttask.core.base.FeatureViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import navigation.compose.NavigationManager
import javax.inject.Inject

@HiltViewModel
internal class FeatureCharingStationsViewModel @Inject constructor(
    private val navigationManager: NavigationManager,
    private val dataProvider: DataProvider
) : FeatureViewModel<Event, State, Effect>() {

    init {
        onObservers()
    }

    override fun setInitialState() = State.default()
    override fun onErrorHandler(exception: Throwable) {
        TODO("хэндлер обработки ошибок")
    }

    private fun onObservers() {
        dataProvider
            .getChosenCity()
            .onEach {
                setEvent(Event.ServiceEvent.OnFillSortedCities(it))
            }
            .launchIn(viewModelScope)

        dataProvider
            .getFilteredByCitiesList()
            .onEach {
                setState {
                    copy(filteredByCities = it)
                }
            }
            .launchIn(viewModelScope)
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
        }
    }

    private fun onEventService(event: Event.ServiceEvent) {
        when (event) {
            is Event.ServiceEvent.OnFillSortedCities -> {
                filterByCity(event.city)
            }
        }
    }

    private fun filterByCity(city: String) {
        viewModelScope.launch {
            dataProvider.filterByCity(city)
        }
    }
}