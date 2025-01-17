package com.atomtesttask.citylist.presenter.chargingstations

import com.atomtesttask.core.base.ViewEvent
import com.atomtesttask.core.base.ViewSideEffect
import com.atomtesttask.core.base.ViewState
import com.atomtesttask.domain.model.ChargingStationsModel

internal class FeatureCharingStationsContract {
    data class State(
        val filteredByCities: List<ChargingStationsModel>,
    ) : ViewState {
        companion object {
            fun default() = State(
                filteredByCities = emptyList(),
            )
        }
    }

    sealed class Event : ViewEvent {
        sealed class ActionsEvent : Event() {
            data object GoToBack : ActionsEvent()
        }

        sealed class ServiceEvent : Event() {
            class OnFillSortedCities(val city: String) : ServiceEvent()
        }
    }

    sealed class Effect : ViewSideEffect
}