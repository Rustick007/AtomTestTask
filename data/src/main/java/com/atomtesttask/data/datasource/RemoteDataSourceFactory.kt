package com.atomtesttask.data.datasource

import javax.inject.Inject


internal class RemoteDataSourceFactory
@Inject constructor() {
    fun createRemoteDataSource(): IDataSource =
        MockDataSource()
}
