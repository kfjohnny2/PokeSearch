package com.tarkus.pokesearch.model.version

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import com.tarkus.pokesearch.util.contracts.NAME_FIELD
import com.tarkus.pokesearch.util.contracts.URL_FIELD
import kotlinx.parcelize.Parcelize

@Parcelize
data class Version (
    @SerializedName(NAME_FIELD)
    val versionName: String,
    @SerializedName(URL_FIELD)
    val versionUrl : String
) : Parcelable
