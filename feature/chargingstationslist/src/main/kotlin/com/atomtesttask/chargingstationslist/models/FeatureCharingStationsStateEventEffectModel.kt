package com.atomtesttask.chargingstationslist.models

import com.atomtesttask.chargingstationslist.presenter.FeatureCharingStationsContract

internal data class FeatureCharingStationsStateEventEffectModel(
    val state: FeatureCharingStationsContract.State,
    val event: (event: FeatureCharingStationsContract.Event) -> Unit,
    val effect: FeatureCharingStationsContract.Effect? = null,
)