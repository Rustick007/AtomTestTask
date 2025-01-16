package com.atomtesttask.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.atomtesttask.presenter.localNavigationProvider
import navigation.register

@Composable
fun AppNavGraph(navController: NavHostController, startDestination: String) {
    val provider = localNavigationProvider.current
    NavHost(
        navController = navController,
        startDestination = startDestination,
    ) {
        register(
            provider.cityListFeature(),
            navController = navController,
        )
        register(
            provider.chargingStationsListFeature(),
            navController = navController
        )
    }
}
