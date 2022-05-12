package com.tarkus.pokesearch.model.item

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import com.tarkus.pokesearch.util.contracts.NAME_FIELD
import com.tarkus.pokesearch.util.contracts.URL_FIELD
import kotlinx.parcelize.Parcelize

@Parcelize
data class Item(
    @SerializedName(NAME_FIELD)
    val itemName : String,
    @SerializedName(URL_FIELD)
    val itemUrl : String
) : Parcelable