package com.tarkus.pokesearch.model.encounter

import com.google.gson.annotations.SerializedName
import com.tarkus.pokesearch.util.contracts.NAME_FIELD
import com.tarkus.pokesearch.util.contracts.URL_FIELD

data class Method(
    @SerializedName(NAME_FIELD)
    val methodName : String,
    @SerializedName(URL_FIELD)
    val methodUrl : String
)
