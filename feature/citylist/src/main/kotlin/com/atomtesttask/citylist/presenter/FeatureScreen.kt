package com.atomtesttask.citylist.presenter

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.hilt.navigation.compose.hiltViewModel
import com.atomtesttask.citylist.R
import com.atomtesttask.citylist.models.Constants
import com.atomtesttask.citylist.models.FeatureStateEventEffectModel
import com.atomtesttask.core.base.ScreenRoute

private val localStateEventEffectModel = compositionLocalOf<FeatureStateEventEffectModel> {
    error("No StateEventEffectModel class found!")
}

@Composable
internal fun FeatureCityListNavGraph() {
    val viewModel = hiltViewModel<FeatureCityListViewModel>()
    ScreenRoute(viewModel = viewModel) { state, onEventSent ->
        FeatureCityListScreen(state = state, onEvent = onEventSent)
    }
}

@Composable
private fun FeatureCityListScreen(
    state: FeatureCityListContract.State,
    onEvent: (event: FeatureCityListContract.Event) -> Unit
) {
    val model = FeatureStateEventEffectModel(state = state, event = onEvent)
    CompositionLocalProvider(localStateEventEffectModel provides model) {
        CreateScreen()
    }
}

@Composable
private fun CreateScreen() {
    val state = localStateEventEffectModel.current.state
    val event = localStateEventEffectModel.current.event
    val list = listOf(
        "sdf",
        "sdfds",
        "dsfdsf",
        "sdfdsfsd",
        "dsfsdfs",
        "sdfsdfsd",
        "sdfdsfds",
        "sdfdsfs",
        "sdfsdfds",
        "sdfdsfs"
    )
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Color.White
            ),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        Text(
            modifier = Modifier
                .padding(vertical = Constants.dimensions.x5),
            text = stringResource(id = R.string.select_city),
            textAlign = TextAlign.Center,
            fontSize = Constants.fontSize.f24
        )
        LazyColumn {
            itemsIndexed(items = list) { index, _ ->
                SelectItem.Item(
                    modifier = Modifier.padding(horizontal = Constants.dimensions.x2_5),
                    title = list[index],
                    onClick = {
                        event.invoke(
                            FeatureCityListContract.Event.ActionsEvent.CityClicked(
                                list[index]
                            )
                        )
                    },
                    isChecked = state.clickedCity == list[index]
                )
                Divider(
                    modifier = Modifier.padding(
                        start = Constants.dimensions.x2_5,
                        end = Constants.dimensions.x2_5,
                    ),
                    color = Color.LightGray,
                )
            }
        }
        Button(
            modifier = Modifier
                .padding(
                    horizontal = Constants.dimensions.x2_5,
                    vertical = Constants.dimensions.x2_5
                )
                .fillMaxWidth()
                .height(Constants.dimensions.x10),
            colors = ButtonColors(
                containerColor = Color.Red,
                contentColor = Color.White,
                disabledContentColor = Color.White,
                disabledContainerColor = Color.Gray
            ),
            shape = RoundedCornerShape(
                topStart = Constants.dimensions.x3,
                topEnd = Constants.dimensions.x3,
                bottomEnd = Constants.dimensions.x3,
                bottomStart = Constants.dimensions.x3
            ),
            onClick = { event.invoke(FeatureCityListContract.Event.ActionsEvent.GoToSecondScreen) },
        ){
            Text(
                text = stringResource(id = R.string.approve),
                fontSize = Constants.fontSize.f16,
                color = Color.White
            )
        }
    }
}


