package com.tarkus.pokesearch.di.modules

import com.tarkus.pokesearch.base.BaseRepository
import com.tarkus.pokesearch.model.search.SearchResult
import com.tarkus.pokesearch.repository.PokemonRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Singleton
    @Binds
    internal abstract fun bindSectionRepository(pokemonRepository: PokemonRepository): BaseRepository<SearchResult>
}