package com.tarkus.pokesearch.model.game_indices

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import com.tarkus.pokesearch.model.version.Version
import com.tarkus.pokesearch.util.contracts.GAME_INDEX_FIELD
import kotlinx.parcelize.Parcelize

@Parcelize
data class GameIndice (
    @SerializedName(GAME_INDEX_FIELD)
    val gameIndex : Int,
    val version : Version
) : Parcelable
