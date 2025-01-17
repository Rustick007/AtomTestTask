package com.atomtesttask.navigation

import com.atomtesttask.citylist.navigation.FeatureCityListApi
import javax.inject.Inject

class DependencyProvider @Inject constructor(
    private val cityListApi: FeatureCityListApi,
) {
    fun cityListFeature(): FeatureCityListApi = cityListApi
}