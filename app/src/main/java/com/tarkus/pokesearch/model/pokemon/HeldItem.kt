package com.tarkus.pokesearch.model.pokemon

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import com.tarkus.pokesearch.model.item.Item
import com.tarkus.pokesearch.model.version.ItemVersionDetail
import com.tarkus.pokesearch.util.contracts.VERSION_DETAILS_FIELD
import kotlinx.parcelize.Parcelize

@Parcelize
data class HeldItem(
    val item : Item,
    @SerializedName(VERSION_DETAILS_FIELD)
    val itemVersionDetails : List<ItemVersionDetail>
) : Parcelable
