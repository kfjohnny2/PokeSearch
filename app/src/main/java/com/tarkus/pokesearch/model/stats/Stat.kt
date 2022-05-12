package com.tarkus.pokesearch.model.stats

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import com.tarkus.pokesearch.util.contracts.NAME_FIELD
import com.tarkus.pokesearch.util.contracts.URL_FIELD
import kotlinx.parcelize.Parcelize

@Parcelize
data class Stat(
    @SerializedName(NAME_FIELD) val statName : String,
    @SerializedName(URL_FIELD) val statUrl : String
) : Parcelable
