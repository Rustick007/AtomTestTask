package com.atomtesttask.presenter

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.CompositionLocalProvider
import com.atomtesttask.navigation.DependencyProvider
import com.atomtesttask.presenter.models.DependencyModel
import com.atomtesttask.ui.theme.AtomTestTaskTheme
import dagger.hilt.android.AndroidEntryPoint
import navigation.compose.NavigationManager
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    /**Зависимость менеджера навигации, для перехода из модуля в другой модуль**/
    @Inject
    lateinit var navigationManager: NavigationManager

    /**Зависимость для подключения провайдера модулей**/
    @Inject
    lateinit var provider: DependencyProvider

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AtomTestTaskTheme {
                CompositionLocalProvider(
                    localNavigationProvider provides provider,
                    localDependencyProvider provides DependencyModel(navigationManager = navigationManager),
                ) {
                    onShowLayout()
                }
            }
        }
    }
}

