package com.tarkus.pokesearch.repository

import android.content.Context
import com.tarkus.pokesearch.base.BaseRepository
import com.tarkus.pokesearch.di.modules.IoDispatcher
import com.tarkus.pokesearch.model.search.SearchResult
import com.tarkus.pokesearch.network.PokemonApi
import kotlinx.coroutines.CoroutineDispatcher
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PokemonRepository @Inject constructor(
    private val pokemonApi: PokemonApi,
    context: Context,
    @IoDispatcher ioDispatcher: CoroutineDispatcher
) : BaseRepository<SearchResult>(context, ioDispatcher) {
    override suspend fun query(id: String?): SearchResult? {
        return null
    }

    override suspend fun fetch(url: String?): SearchResult = pokemonApi.getPokemons()

    override suspend fun saveFetchResult(t: SearchResult) {
    }
}