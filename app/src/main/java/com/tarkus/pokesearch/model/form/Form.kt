package com.tarkus.pokesearch.model.form

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import com.tarkus.pokesearch.util.contracts.NAME_FIELD
import com.tarkus.pokesearch.util.contracts.URL_FIELD
import kotlinx.parcelize.Parcelize

@Parcelize
data class Form(
    @SerializedName(NAME_FIELD)
    val formName : String,
    @SerializedName(URL_FIELD)
    val formUrl : String
) : Parcelable


