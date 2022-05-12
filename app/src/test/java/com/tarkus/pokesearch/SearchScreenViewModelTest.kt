package com.tarkus.pokesearch

import android.content.Context
import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.SavedStateHandle
import com.tarkus.pokesearch.model.pokemon.Pokemon
import com.tarkus.pokesearch.model.search.SearchResult
import com.tarkus.pokesearch.network.PokemonApi
import com.tarkus.pokesearch.repository.PokemonRepository
import com.tarkus.pokesearch.ui.search.SearchScreenViewModel
import com.tarkus.pokesearch.util.contracts.ScreenContracts
import com.tarkus.pokesearch.util.extensions.isNetworkAvailable
import com.tarkus.pokesearch.util.handlers.ResultHandler
import io.mockk.every
import io.mockk.mockk
import io.mockk.mockkStatic
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TestRule
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.MockitoAnnotations

@ExperimentalCoroutinesApi
class SearchScreenViewModelTest {

    @get:Rule
    val rule: TestRule = InstantTaskExecutorRule()

    @get:Rule
    val testCoroutineRule = TestCoroutineRule()

    @Mock
    private lateinit var pokemonApi: PokemonApi

    @Mock
    private lateinit var context: Context

    @Before
    fun setup(){
        MockitoAnnotations.openMocks(this)
    }

    @Test
    fun testResultSuccess(){
        mockkStatic("com.tarkus.pokesearch.util.extensions.ContextExtensionsKt")
        every {
            context.isNetworkAvailable()
        } returns true
        testCoroutineRule.runBlockingTest {
            `when`(pokemonApi.getPokemons()).thenReturn(
                SearchResult(1, "next", "previous", listOf())
            )
        }
        val pokemonRepository = PokemonRepository(pokemonApi, context, Dispatchers.Main)
        testCoroutineRule.pauseDispatcher()
        val savedStateHandle = mockk<SavedStateHandle>(relaxed = true)
        every {
            savedStateHandle.get<String>(ScreenContracts.LINK)
        } returns "link"
        val viewModel = SearchScreenViewModel(pokemonRepository, savedStateHandle)
        assertThat(viewModel.stateFlow.value, `is`(ResultHandler.Loading))

        testCoroutineRule.resumeDispatcher()
        assertThat(viewModel.stateFlow.value, `is`(ResultHandler.Success(null)))
    }
}