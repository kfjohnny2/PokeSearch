package com.tarkus.pokesearch.model.search

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import com.tarkus.pokesearch.util.contracts.NAME_FIELD
import com.tarkus.pokesearch.util.contracts.URL_FIELD

@Entity(tableName = "pokemon_sample")
data class PokemonSample (
    @PrimaryKey(autoGenerate = true)
    val sampleId : Int,
    @SerializedName(NAME_FIELD)
    val pokemonName : String,
    @SerializedName(URL_FIELD)
    val pokemonUrl : String
)