package com.tarkus.pokesearch.model.moves

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import com.tarkus.pokesearch.util.contracts.NAME_FIELD
import com.tarkus.pokesearch.util.contracts.URL_FIELD
import kotlinx.parcelize.Parcelize

@Parcelize
data class Move(

    @SerializedName(NAME_FIELD) val moveName: String,
    @SerializedName(URL_FIELD) val moveUrl: String?
) : Parcelable
