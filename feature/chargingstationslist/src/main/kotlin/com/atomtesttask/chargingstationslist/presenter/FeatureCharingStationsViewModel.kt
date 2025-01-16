package com.atomtesttask.chargingstationslist.presenter

import com.atomtesttask.chargingstationslist.presenter.FeatureCharingStationsContract.Effect
import com.atomtesttask.chargingstationslist.presenter.FeatureCharingStationsContract.Event
import com.atomtesttask.chargingstationslist.presenter.FeatureCharingStationsContract.State
import com.atomtesttask.core.base.FeatureViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import navigation.compose.NavigationManager
import javax.inject.Inject

@HiltViewModel
internal class FeatureCharingStationsViewModel @Inject constructor(private val navigationManager: NavigationManager) :
    FeatureViewModel<Event, State, Effect>() {

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
        }
    }

    private fun onEventService(event: Event.ServiceEvent) {
        when (event) {
            // TODO("Добавить свою обработку")
            else -> {}
        }
    }
}