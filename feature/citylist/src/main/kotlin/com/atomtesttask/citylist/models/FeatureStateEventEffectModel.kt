package com.atomtesttask.citylist.models

import com.atomtesttask.citylist.presenter.FeatureCityListContract

internal data class FeatureStateEventEffectModel(
    val state: FeatureCityListContract.State,
    val event: (event: FeatureCityListContract.Event) -> Unit,
    val effect: FeatureCityListContract.Effect? = null,
)