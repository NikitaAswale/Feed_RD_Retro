package com.example.feed_rd_retro

class Post_Repository  {

    private val apiservice = RetrofitInstance.api

    suspend fun getposts(): List<posts>{
        return try {
            apiservice.getPosts()
        }catch (e: Exception){
            e.printStackTrace()
            emptyList()
        }

    }
}