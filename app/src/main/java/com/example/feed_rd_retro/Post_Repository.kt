package com.example.feed_rd_retro

import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import kotlin.collections.emptyList

class Post_Repository @Inject constructor (
    private val apiService: APIService,
    private val postDao: postDAO
) {

    fun getPosts(): Flow<List<PostDTO>> = postDao.getAllPosts()

    suspend fun refreshUsers(){
        try {
            val posts = apiService.getPosts()
            postDao.clearAll()
            postDao.insertAll(posts.map {it.toEntity()})
        }catch (e: Exception){
            e.printStackTrace()

        }

    }
}