package com.tarkus.pokesearch.model.version

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import com.tarkus.pokesearch.util.contracts.NAME_FIELD
import com.tarkus.pokesearch.util.contracts.URL_FIELD
import kotlinx.parcelize.Parcelize

@Parcelize
data class VersionGroup(
    @SerializedName(NAME_FIELD) val versionGroupName: String?,
    @SerializedName(URL_FIELD) val versionGroupUrl: String?

) : Parcelable
