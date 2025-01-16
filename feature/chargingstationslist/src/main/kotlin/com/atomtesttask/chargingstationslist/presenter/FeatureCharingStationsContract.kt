package com.atomtesttask.chargingstationslist.presenter

import com.atomtesttask.core.base.ViewEvent
import com.atomtesttask.core.base.ViewSideEffect
import com.atomtesttask.core.base.ViewState

internal class FeatureCharingStationsContract {

    data class State(val isShowTopBar: Boolean = false) : ViewState {
        companion object {
            fun default() = State(
                isShowTopBar = false,
            )
        }
    }

    sealed class Event : ViewEvent {
        sealed class ActionsEvent : Event() {
            data object GoToBack : ActionsEvent()
        }

        sealed class ServiceEvent : Event() {
        }
    }

    sealed class Effect : ViewSideEffect
}