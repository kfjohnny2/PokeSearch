package com.tarkus.pokesearch.model.location

import com.google.gson.annotations.SerializedName
import com.tarkus.pokesearch.util.contracts.NAME_FIELD
import com.tarkus.pokesearch.util.contracts.URL_FIELD

data class LocationArea(
    @SerializedName(NAME_FIELD)
    val locationAreaName : String,
    @SerializedName(URL_FIELD)
    val locationAreaUrl : String
)