package com.tarkus.pokesearch.model.version

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ItemVersionDetail(
    val rarity : Int,
    val version : Version
) : Parcelable