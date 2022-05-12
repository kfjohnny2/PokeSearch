package com.tarkus.pokesearch.model.search

data class SearchResult (
    val count : Int,
    val next : String,
    val previous : String,
    val results : List<PokemonSample>
)