package com.atomtesttask.chargingstationslist.navigation

import navigation.compose.NavigationComposeEntry

sealed class FeatureCharingStationsDestinations(override val baseRoute: String) :
    NavigationComposeEntry {
    operator fun invoke() = getComposableRoute()

    sealed class Common(override val baseRoute: String) :
        FeatureCharingStationsDestinations("$COMMON_ROOT_ROUT/$baseRoute") {
        companion object {
            const val COMMON_ROOT_ROUT = "FeatureCharingStations"
        }
    }
}