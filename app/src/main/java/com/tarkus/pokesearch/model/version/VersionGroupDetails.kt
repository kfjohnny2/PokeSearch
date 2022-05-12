package com.tarkus.pokesearch.model.version

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import com.tarkus.pokesearch.model.moves.MoveLearnMethod
import com.tarkus.pokesearch.util.contracts.LEVEL_LEARNED_AT_FIELD
import com.tarkus.pokesearch.util.contracts.MOVE_LEARN_METHOD_FIELD
import com.tarkus.pokesearch.util.contracts.VERSION_GROUP_FIELD
import kotlinx.parcelize.Parcelize

@Parcelize
data class VersionGroupDetails (

    @SerializedName(LEVEL_LEARNED_AT_FIELD) val levelLearnedAt : Int,
    @SerializedName(VERSION_GROUP_FIELD) val versionGroup : VersionGroup?,
    @SerializedName(MOVE_LEARN_METHOD_FIELD) val moveLearnMethod : MoveLearnMethod?

) : Parcelable
