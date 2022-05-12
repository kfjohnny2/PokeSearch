package com.tarkus.pokesearch.di.modules

import com.tarkus.pokesearch.BuildConfig
import com.tarkus.pokesearch.network.PokemonApi
import dagger.Module
import dagger.Provides
import dagger.Reusable
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

/**
 * Main entry point for network access.
 */
@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    /**
     * Provides the PokemonApi service implementation.
     * @param retrofit the Retrofit object used to instantiate the service
     * @return the PokemonApi service implementation.
     */
    @Provides
    @Reusable
    internal fun providePokemonApi(retrofit: Retrofit): PokemonApi {
        return retrofit.create(PokemonApi::class.java)
    }

    /**
     * Provides the Retrofit object.
     * @return the Retrofit object
     */
    @Provides
    @Reusable
    internal fun provideRetrofitInterface(): Retrofit {

        val logging = HttpLoggingInterceptor()
        logging.level = HttpLoggingInterceptor.Level.BODY
        val httpClient = OkHttpClient.Builder()

        httpClient.readTimeout(230, TimeUnit.SECONDS)
        httpClient.connectTimeout(230, TimeUnit.SECONDS)

        //INTERCEPTORS
        if (BuildConfig.DEBUG) {
            httpClient.addInterceptor(logging)
        }

        return Retrofit.Builder()
            .baseUrl(BuildConfig.API_URL)
            .client(httpClient.build())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}