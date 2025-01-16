package com.atomtesttask.chargingstationslist.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.atomtesttask.chargingstationslist.presenter.FeatureCharingStationsNavGraph
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class FeatureCharingStationsImpl @Inject constructor() : FeatureCharingStationsApi {
    override val baseRoute = FeatureCharingStationsDestinations.Common.COMMON_ROOT_ROUT

    override fun registerGraph(navGraphBuilder: NavGraphBuilder, navController: NavHostController) {
        navGraphBuilder.composable(
            route = baseRoute,
        ) {
            FeatureCharingStationsNavGraph()
        }
    }
}