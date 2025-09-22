package com.example.memestream.api

import com.squareup.moshi.Moshi
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object RetrofitInstance {

    private const val BASE_URL = "http://10.0.2.2:5000/" // Maps to localhost from emulator

    private val moshi = Moshi.Builder().build()

    val api: MemeApiService by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create(moshi))
            .build()
            .create(MemeApiService::class.java)
    }
}
