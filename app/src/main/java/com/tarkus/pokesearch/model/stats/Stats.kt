package com.tarkus.pokesearch.model.stats

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import com.tarkus.pokesearch.util.contracts.BASE_STAT_FIELD
import kotlinx.parcelize.Parcelize

@Parcelize
data class Stats(
    @SerializedName(BASE_STAT_FIELD) val baseStat : Int,
    val effort : Int,
    val stat : Stat
) : Parcelable
