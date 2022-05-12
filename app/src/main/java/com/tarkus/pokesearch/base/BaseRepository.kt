package com.tarkus.pokesearch.base

import android.content.Context
import com.tarkus.pokesearch.R
import com.tarkus.pokesearch.util.extensions.isNetworkAvailable
import com.tarkus.pokesearch.util.handlers.ResultHandler
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import timber.log.Timber

abstract class BaseRepository<T>(
    private val context: Context,
    private val ioDispatcher: CoroutineDispatcher
) {
    protected abstract suspend fun query(id: String?): T?

    protected abstract suspend fun fetch(url: String?): T

    protected abstract suspend fun saveFetchResult(t: T)

    fun getResult(id: String?, url: String?): Flow<ResultHandler<T?>> = flow {
        emit(ResultHandler.Loading)
        query(id)?.let {
            emit(ResultHandler.Success(it))
            refresh(url)
            emit(ResultHandler.Success(query(id)))
        } ?: run {
            if (context.isNetworkAvailable()) {
                try {
                    refresh(url)
                    emit(ResultHandler.Success(query(id)))
                } catch (t: Throwable){
                    emit(ResultHandler.Error(context.getString(R.string.failed_loading_msg)))
                }
            } else {
                emit(ResultHandler.Error(context.getString(R.string.failed_network_msg)))
            }
        }
    }.flowOn(ioDispatcher).catch { Timber.e(it) }

    private suspend fun refresh(url: String?) {
        saveFetchResult(fetch(url))
    }
}