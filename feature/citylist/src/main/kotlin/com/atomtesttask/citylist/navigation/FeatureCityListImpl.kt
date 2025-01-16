package com.atomtesttask.citylist.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.atomtesttask.citylist.presenter.FeatureCityListNavGraph
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class FeatureCityListImpl @Inject constructor() : FeatureCityListApi {
    override val baseRoute = FeatureCityListDestinations.Common.COMMON_ROOT_ROUT

    override fun registerGraph(navGraphBuilder: NavGraphBuilder, navController: NavHostController) {
        navGraphBuilder.composable(
            route = baseRoute,
        ) {
            FeatureCityListNavGraph()
        }
    }
}