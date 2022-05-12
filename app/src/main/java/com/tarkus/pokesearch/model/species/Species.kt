package com.tarkus.pokesearch.model.species

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import com.tarkus.pokesearch.util.contracts.*
import kotlinx.parcelize.Parcelize

@Parcelize
data class Species(
    @SerializedName(NAME_FIELD) val speciesName : String,
    @SerializedName(URL_FIELD) val speciesUrl : String
) : Parcelable
