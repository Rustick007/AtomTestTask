package com.atomtesttask.citylist.models

import com.atomtesttask.citylist.presenter.chargingstations.FeatureCharingStationsContract

internal data class FeatureCharingStationsStateEventEffectModel(
    val state: FeatureCharingStationsContract.State,
    val event: (event: FeatureCharingStationsContract.Event) -> Unit,
    val effect: FeatureCharingStationsContract.Effect? = null,
)