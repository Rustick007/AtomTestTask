package com.atomtesttask.data.api


data class ChargingStationsResponse(
    val charger: Charger,
    val city: String
) {
    data class Charger(
        val address: String,
        val busy: Boolean,
        val name: String
    )
}



