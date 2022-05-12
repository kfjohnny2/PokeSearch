package com.tarkus.pokesearch.model.types

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Types(
    val slot : Int,
    val type : Type?
) : Parcelable
