package com.tarkus.pokesearch.model.pokemon

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import com.tarkus.pokesearch.model.form.Form
import com.tarkus.pokesearch.model.game_indices.GameIndice
import com.tarkus.pokesearch.model.moves.Moves
import com.tarkus.pokesearch.model.species.Species
import com.tarkus.pokesearch.model.sprites.Sprites
import com.tarkus.pokesearch.model.stats.Stats
import com.tarkus.pokesearch.model.types.Types
import com.tarkus.pokesearch.util.contracts.*
import kotlinx.parcelize.Parcelize

@Parcelize
data class Pokemon(
    @SerializedName(ID_FIELD)
    val pokemonId: Int,
    @SerializedName(NAME_FIELD)
    val pokemonName: String?,
    @SerializedName(BASE_EXPERIENCE_FIELD)
    val baseExperience: Int,
    val height: Int,
    @SerializedName(IS_DEFAULT_FIELD)
    val isDefault: Boolean,
    val order: Int,
    val weight: Int,
    val abilities: List<Ability>?,
    val forms: List<Form>,
    @SerializedName(GAME_INDICES_FIELD)
    val gameIndices: List<GameIndice>,
    @SerializedName(HELD_ITEMS_FIELD)
    val heldItems: List<HeldItem>,
    @SerializedName(LOCATION_AREA_ENCOUNTERS_FIELD)
    val locationAreaEncounters: String?,
    val moves: List<Moves>?,
    val species: Species,
    val sprites: Sprites,
    val stats: List<Stats>,
    val types: List<Types>?
) : Parcelable