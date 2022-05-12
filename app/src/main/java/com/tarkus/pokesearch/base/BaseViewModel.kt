package com.tarkus.pokesearch.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.tarkus.pokesearch.util.handlers.ResultHandler
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

open class BaseViewModel<T>(
    private val repository: BaseRepository<T>,
    private val linkId: String? = null,
    private val linkUrl: String? = null
) : ViewModel(){

    private val mutableStateFlow = MutableStateFlow<ResultHandler<T?>>(ResultHandler.Loading)
    val stateFlow: StateFlow<ResultHandler<T?>> get() = mutableStateFlow

    private val mutableIsRefreshing = MutableStateFlow(false)
    val isRefreshing: StateFlow<Boolean> get() = mutableIsRefreshing.asStateFlow()

    init {
        refresh()
    }

    private fun refresh() {
        viewModelScope.launch {
            mutableIsRefreshing.emit(true)
            repository.getResult(linkId, linkUrl).collect {
                mutableStateFlow.tryEmit(it)
            }
            mutableIsRefreshing.emit(false)
        }
    }
}