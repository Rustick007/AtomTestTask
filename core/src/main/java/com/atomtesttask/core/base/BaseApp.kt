package com.atomtesttask.core.base

import android.app.Application

abstract class BaseApp : Application() {

    override fun onCreate() {
        super.onCreate()
        context = this
    }

    companion object {
        lateinit var context: BaseApp private set
    }
}