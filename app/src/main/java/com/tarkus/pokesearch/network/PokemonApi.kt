package com.tarkus.pokesearch.network

import com.tarkus.pokesearch.model.pokemon.Pokemon
import com.tarkus.pokesearch.model.search.SearchResult
import com.tarkus.pokesearch.util.contracts.ID_FIELD
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PokemonApi {
    /**
     * Get the list of pokemons from the API
     */
    @GET("pokemon/")
    suspend fun getPokemons() : SearchResult
    /**
     * Get the list of pokemons from the API
     */
    @GET("pokemon/")
    suspend fun getPokemons(@Query("limit") limit : Int) : SearchResult

    /**
     * Get the pokemon from the API
     */
    @GET("pokemon/{id}")
    suspend fun getPokemon(@Path(ID_FIELD) pokemonId: String) : Pokemon
}