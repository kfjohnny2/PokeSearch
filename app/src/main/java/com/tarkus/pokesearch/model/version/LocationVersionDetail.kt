package com.tarkus.pokesearch.model.version

import com.google.gson.annotations.SerializedName
import com.tarkus.pokesearch.model.encounter.EncounterDetail
import com.tarkus.pokesearch.model.version.Version
import com.tarkus.pokesearch.util.contracts.ENCOUNTER_DETAILS_FIELD
import com.tarkus.pokesearch.util.contracts.MAX_CHANCE_FIELD

data class LocationVersionDetail(
    @SerializedName(MAX_CHANCE_FIELD)
    val maxChance : Int,
    @SerializedName(ENCOUNTER_DETAILS_FIELD)
    val encounterDetails : List<EncounterDetail>,
    val version: Version
)
