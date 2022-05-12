package com.tarkus.pokesearch.model.encounter

import com.google.gson.annotations.SerializedName
import com.tarkus.pokesearch.util.contracts.MAX_LEVEL_FIELD
import com.tarkus.pokesearch.util.contracts.MIN_LEVEL_FIELD

data class EncounterDetail(
    @SerializedName(MIN_LEVEL_FIELD)
    val minLevel : Int,
    @SerializedName(MAX_LEVEL_FIELD)
    val maxLevel : Int,
    val conditionValues : List<ConditionValue>,
    val chance : Int,
    val method : Method
)