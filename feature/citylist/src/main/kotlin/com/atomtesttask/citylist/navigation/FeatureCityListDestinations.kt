package com.atomtesttask.citylist.navigation

import navigation.compose.NavigationComposeEntry

sealed class FeatureCityListDestinations(override val baseRoute: String) : NavigationComposeEntry {
    operator fun invoke() = getComposableRoute()

    sealed class Common(override val baseRoute: String) :
        FeatureCityListDestinations("$COMMON_ROOT_ROUT/$baseRoute") {
        companion object {
            const val COMMON_ROOT_ROUT = "CityListFeature"
        }
    }
}