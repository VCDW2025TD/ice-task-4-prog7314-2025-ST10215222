package com.example.memestream.api

import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

data class Meme(
    val id: String,
    val title: String,
    val imageUrl: String
)

interface MemeApiService {

    @GET("memes")
    suspend fun getMemes(): List<Meme>

    @POST("memes")
    suspend fun postMeme(@Body meme: Meme): Meme
}
