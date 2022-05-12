package com.tarkus.pokesearch.util.contracts

sealed class ScreenContracts(val title: String){
    object Search: ScreenContracts("search_result/{$LINK}")

    companion object {
        const val LINK = "link"
    }
}