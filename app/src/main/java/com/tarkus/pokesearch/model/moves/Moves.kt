package com.tarkus.pokesearch.model.moves

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import com.tarkus.pokesearch.model.version.VersionGroupDetails
import com.tarkus.pokesearch.util.contracts.VERSION_GROUP_DETAILS_FIELD
import kotlinx.parcelize.Parcelize

@Parcelize
data class Moves(
    val move : Move?,
    @SerializedName(VERSION_GROUP_DETAILS_FIELD) val versionGroupDetails : List<VersionGroupDetails> ?
) : Parcelable
