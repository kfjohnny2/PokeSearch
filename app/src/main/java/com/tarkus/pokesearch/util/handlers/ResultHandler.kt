package com.tarkus.pokesearch.util.handlers

const val EMPTY_DEFAULT_MESSAGE = "No results found"

sealed class ResultHandler<out R> {
    data class Success<out T>(val data: T) : ResultHandler<T>()
    data class Error(val errorMessage: String): ResultHandler<Nothing>()
    data class Empty(val emptyMessage: String = EMPTY_DEFAULT_MESSAGE) : ResultHandler<Nothing>()
    object Loading: ResultHandler<Nothing>()
}
