package com.atomtesttask.core.base

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.Main
import kotlinx.coroutines.SupervisorJob

abstract class BaseCoroutineViewModel : ViewModel() {
    private val handler =
        CoroutineExceptionHandler { _, exception ->
            onErrorHandler(exception)
        }

    private var viewModelJob = SupervisorJob()
    protected val viewModelScope = CoroutineScope(Main + viewModelJob + handler)
    protected val viewModelScopeWithoutHandler = CoroutineScope(Main + viewModelJob)

    protected abstract fun onErrorHandler(exception: Throwable)

    override fun onCleared() {
        super.onCleared()
        viewModelJob.cancel()
    }
}
