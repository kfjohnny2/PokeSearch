package com.tarkus.pokesearch.model.pokemon

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import com.tarkus.pokesearch.util.contracts.IS_HIDDEN_FIELD
import com.tarkus.pokesearch.util.contracts.NAME_FIELD
import com.tarkus.pokesearch.util.contracts.URL_FIELD
import kotlinx.parcelize.Parcelize

@Parcelize
data class Ability(
    @SerializedName(NAME_FIELD)
    val abilityName: String,
    @SerializedName(URL_FIELD)
    val abilityUrl: String?,
    @SerializedName(IS_HIDDEN_FIELD)
    val isHidden: Boolean,
    val slot: Int
) : Parcelable