package com.atomtesttask.domain.model

data class ChargingStationsModel(
    val charger: Charger,
    val city: String
) {
    data class Charger(
        val address: String,
        val busy: Boolean,
        val name: String
    )
}


