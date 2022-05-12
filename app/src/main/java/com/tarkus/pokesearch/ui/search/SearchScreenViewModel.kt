package com.tarkus.pokesearch.ui.search

import androidx.lifecycle.SavedStateHandle
import com.tarkus.pokesearch.base.BaseRepository
import com.tarkus.pokesearch.base.BaseViewModel
import com.tarkus.pokesearch.model.search.SearchResult
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SearchScreenViewModel @Inject constructor(
    repository: BaseRepository<SearchResult>,
    savedStateHandle: SavedStateHandle
) : BaseViewModel<SearchResult>(repository)