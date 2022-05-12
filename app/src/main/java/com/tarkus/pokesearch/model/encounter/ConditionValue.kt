package com.tarkus.pokesearch.model.encounter

import com.google.gson.annotations.SerializedName
import com.tarkus.pokesearch.util.contracts.NAME_FIELD
import com.tarkus.pokesearch.util.contracts.URL_FIELD

data class ConditionValue(
    @SerializedName(NAME_FIELD)
    val conditionValueName : String,
    @SerializedName(URL_FIELD)
    val conditionValueUrl : String
)