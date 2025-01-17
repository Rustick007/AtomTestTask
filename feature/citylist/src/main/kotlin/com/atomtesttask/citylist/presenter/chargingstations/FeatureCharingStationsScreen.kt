package com.atomtesttask.citylist.presenter.chargingstations

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
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
import com.atomtesttask.citylist.models.FeatureCharingStationsStateEventEffectModel
import com.atomtesttask.citylist.presenter.SelectItem
import com.atomtesttask.core.base.ScreenRoute

private val localStateEventEffectModel =
    compositionLocalOf<FeatureCharingStationsStateEventEffectModel> {
        error("No StateEventEffectModel class found!")
    }

@Composable
internal fun FeatureCharingStationsNavGraph() {
    val viewModel = hiltViewModel<FeatureCharingStationsViewModel>()
    ScreenRoute(viewModel = viewModel) { state, onEventSent ->
        Column(modifier = Modifier.fillMaxSize()) {
            FeatureCharingStationsScreen(state = state, onEvent = onEventSent)
        }
    }
}

@Composable
private fun FeatureCharingStationsScreen(
    state: FeatureCharingStationsContract.State,
    onEvent: (event: FeatureCharingStationsContract.Event) -> Unit
) {
    val model = FeatureCharingStationsStateEventEffectModel(state = state, event = onEvent)
    CompositionLocalProvider(localStateEventEffectModel provides model) {
        CreateScreen()
    }
}

@Composable
private fun CreateScreen() {
    val state = localStateEventEffectModel.current.state
    val event = localStateEventEffectModel.current.event
    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .wrapContentSize()
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
                itemsIndexed(items = state.filteredByCities) { index, _ ->
                    SelectItem.Item(
                        modifier = Modifier.padding(horizontal = Constants.dimensions.x2_5),
                        title = state.filteredByCities[index].charger.name,
                        subtitleLeft = state.filteredByCities[index].charger.address,
                        backgroundColor = if (state.filteredByCities[index].charger.busy) Color.Red.copy(
                            alpha = Constants.digital.f06
                        ) else Color.Green.copy(alpha = Constants.digital.f06),
                        onClick = {},
                        isChecked = false
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
        }
        Button(
            modifier = Modifier
                .align(Alignment.BottomCenter)
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
            onClick = { event.invoke(FeatureCharingStationsContract.Event.ActionsEvent.GoToBack) },
        ) {
            Text(
                text = stringResource(id = R.string.back),
                fontSize = Constants.fontSize.f16,
                color = Color.White
            )
        }
    }
}
