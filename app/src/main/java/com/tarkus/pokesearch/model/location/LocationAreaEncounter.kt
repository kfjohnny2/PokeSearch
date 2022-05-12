package com.tarkus.pokesearch.model.location

import com.google.gson.annotations.SerializedName
import com.tarkus.pokesearch.model.version.LocationVersionDetail
import com.tarkus.pokesearch.util.contracts.LOCATION_AREA_FIELD
import com.tarkus.pokesearch.util.contracts.VERSION_DETAILS_FIELD

data class LocationAreaEncounter(
    @SerializedName(LOCATION_AREA_FIELD)
    val locationArea : LocationArea,
    @SerializedName(VERSION_DETAILS_FIELD)
    val locationVersionDetails : List<LocationVersionDetail>
)
