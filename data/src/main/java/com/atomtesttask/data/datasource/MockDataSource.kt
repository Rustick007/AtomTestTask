package com.atomtesttask.data.datasource

import com.atomtesttask.data.api.ChargingStationsResponse
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class MockDataSource : IDataSource {
    override fun getChagingStationsData(
    ): List<ChargingStationsResponse>? {
        return try {
            var jsonString =
                """[{"city":"Moscow","charger":{"busy":true,"name":"Энергия Москвы","address":"Измайловское ш., 4А"}},{"city":"Moscow","charger":{"busy":false,"name":"Lipgart","address":"2-я Бауманская ул., 5, стр. 5"}},{"city":"Saint Petersburg","charger":{"busy":true,"name":"Станция зарядки электромобилей","address":"Большой просп. Васильевского острова, 68"}},{"city":"Moscow","charger":{"busy":false,"name":"Zevs","address":"Мясницкая ул., 13, стр. 10"}},{"city":"Saint Petersburg","charger":{"busy":false,"name":"Punkt E","address":"Малая Монетная ул., 2Г"}}]"""
            val gson = Gson()
            val listType = object : TypeToken<List<ChargingStationsResponse>>() {}.type
            val result: List<ChargingStationsResponse> = gson.fromJson(jsonString, listType)
            result
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }
}