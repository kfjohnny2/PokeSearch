package com.tarkus.pokesearch

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.google.accompanist.navigation.animation.AnimatedNavHost
import com.google.accompanist.navigation.animation.composable
import com.google.accompanist.navigation.animation.rememberAnimatedNavController
import com.tarkus.pokesearch.ui.search.SearchScreen
import com.tarkus.pokesearch.ui.theme.PokeSearchTheme
import dagger.hilt.android.AndroidEntryPoint

@ExperimentalAnimationApi
@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PokeSearchTheme {
                val navController = rememberAnimatedNavController()
                AnimatedNavHost(navController = navController,
                    startDestination = "search_screen",
                    enterTransition = {EnterTransition.None},
                    exitTransition = { ExitTransition.None },
                    popEnterTransition = { EnterTransition.None},
                    popExitTransition = { ExitTransition.None}){
                    composable("search_screen"){
                        SearchScreen(navController)
                    }
                }
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PokeSearchTheme {
        Greeting("Android")
    }
}