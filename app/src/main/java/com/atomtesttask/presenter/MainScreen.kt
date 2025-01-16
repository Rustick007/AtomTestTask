package com.atomtesttask.presenter

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.compositionLocalOf
import androidx.navigation.AnimBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.atomtesttask.core.R
import com.atomtesttask.ext.processNavigationCommand
import com.atomtesttask.navigation.AppNavGraph
import com.atomtesttask.navigation.DependencyProvider
import com.atomtesttask.presenter.models.DependencyModel

val localNavigationProvider = compositionLocalOf<DependencyProvider> {
    error("No DependencyProvider class found!")
}

val localDependencyProvider = compositionLocalOf<DependencyModel> {
    error("No DependencyModel class found!")
}

/**
 * Создаём навигацию. Сюда можно добавлять обработки разных сценариев(например, остутствие сети и т.д.)
 *
 */
@Composable
fun onShowLayout() {
    val navController = rememberNavController()
    OnObserverNavigation(navController = navController)
    OnHandleNavigation(navController = navController)
}

@Composable
private fun OnHandleNavigation(navController: NavHostController) {
    /**Первый экран со списком городов и уже из него переходим в приложение.**/
    AppNavGraph(
        navController = navController,
        startDestination = localNavigationProvider.current.cityListFeature().baseRoute
    )
}

/**
 * Служит для прослушки навигации и добавления анимации при переходе с экрана на экран.
 */
@Composable
private fun OnObserverNavigation(navController: NavHostController) {
    val baseAnimation: AnimBuilder.() -> Unit = {
        enter = R.anim.fade_in
        exit = R.anim.fade_out
        popEnter = R.anim.fade_in
        popExit = R.anim.fade_out
    }
    val navigationManager = localDependencyProvider.current.navigationManager
    LaunchedEffect(key1 = R.string.navigation_manager) {
        navigationManager.resetCache()
        navigationManager.commands.collect {
            navController.processNavigationCommand(
                it,
                baseAnimation,
            )
        }
    }
}


