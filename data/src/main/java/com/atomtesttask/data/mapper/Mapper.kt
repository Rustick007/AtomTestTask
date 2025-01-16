package com.atomtesttask.data.mapper

import com.atomtesttask.data.api.ChargingStationsResponse
import com.atomtesttask.domain.model.ChargingStationsModel

internal fun List<ChargingStationsResponse>?.toModel(): List<ChargingStationsModel> {
    return this?.map {
        ChargingStationsModel(
            charger = ChargingStationsModel.Charger(
                address = it.charger.address,
                busy = it.charger.busy,
                name = it.charger.name
            ),
            city = it.city
        )
    }.orEmpty()
}