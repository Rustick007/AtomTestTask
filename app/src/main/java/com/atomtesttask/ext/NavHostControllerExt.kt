package com.atomtesttask.ext

import androidx.navigation.AnimBuilder
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import navigation.compose.NavigationAction
import navigation.compose.NavigationCommand


internal fun NavHostController.processNavigationCommand(
    navigationCommand: NavigationCommand,
    baseAnimation: AnimBuilder.() -> Unit,
) {
    when (navigationCommand.action) {
        NavigationAction.BACK -> if (!navigateUp()) {
            popBackStack()
        }

        NavigationAction.FORWARD ->
            navigationCommand
                .destination
                ?.ifBlank { null }
                ?.let { destination ->
                    navigate(destination) {
                        anim(baseAnimation)
                    }
                }

        NavigationAction.REPLACE ->
            navigationCommand
                .destination
                ?.ifBlank { null }
                ?.let { destination ->
                    navigate(destination) {
                        anim(baseAnimation)
                        popUpTo(graph.findStartDestination().id) {
                            inclusive = true
                        }
                        launchSingleTop = true
                    }
                }

        NavigationAction.REPLACE_CURRENT ->
            navigationCommand
                .destination
                ?.ifBlank { null }
                ?.let { destination ->
                    navigate(destination) {
                        anim(baseAnimation)
                        val tmp = currentBackStackEntry?.destination?.route
                        tmp?.let {
                            popUpTo(it) {
                                inclusive = true
                            }
                        }
                        launchSingleTop = true
                    }
                }

        else -> {}
    }
}
