package com.atomtesttask.navigation

import com.atomtesttask.chargingstationslist.navigation.FeatureCharingStationsApi
import com.atomtesttask.citylist.navigation.FeatureCityListApi
import javax.inject.Inject

class DependencyProvider @Inject constructor(
    private val cityListApi: FeatureCityListApi,
    private val chargingStationsListApi: FeatureCharingStationsApi,
) {
    fun cityListFeature(): FeatureCityListApi = cityListApi
    fun chargingStationsListFeature(): FeatureCharingStationsApi = chargingStationsListApi
}