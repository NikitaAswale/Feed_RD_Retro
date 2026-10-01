package com.example.feed_rd_retro

import retrofit2.http.GET

interface APIService {

    @GET("posts")
    suspend fun getPosts() : List<posts>
}