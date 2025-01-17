package com.atomtesttask.citylist.navigation

import androidx.navigation.NavType
import androidx.navigation.navArgument
import navigation.compose.NavigationComposeEntry

sealed class FeatureCityListDestinations(override val baseRoute: String) : NavigationComposeEntry {
    operator fun invoke() = getComposableRoute()

    sealed class Common(override val baseRoute: String) :
        FeatureCityListDestinations("$COMMON_ROOT_ROUT/$baseRoute") {
        companion object {
            const val COMMON_ROOT_ROUT = "city_list_feature"
            const val CHARGER_LIST_ROUT = "charger_list_rout"
        }

        data object ChargerList : Common(CHARGER_LIST_ROUT) {
            const val ARGUMENT_TYPE = "type"

            override val arguments =
                listOf(
                    navArgument(ARGUMENT_TYPE) {
                        type = NavType.IntType
                    },
                )
        }
    }
}