package com.tarkus.pokesearch.model.moves

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import com.tarkus.pokesearch.util.contracts.NAME_FIELD
import com.tarkus.pokesearch.util.contracts.URL_FIELD
import kotlinx.parcelize.Parcelize

@Parcelize
data class MoveLearnMethod(
    @SerializedName(NAME_FIELD) val fieldName: String?,
    @SerializedName(URL_FIELD) val fieldUrl: String?

) : Parcelable
