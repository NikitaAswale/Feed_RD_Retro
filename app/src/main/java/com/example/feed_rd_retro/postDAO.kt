package com.example.feed_rd_retro

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface postDAO {

    @Query("SELECT * FROM Posts ORDER BY id DESC")
    fun getAllPosts(): Flow<List<PostDTO>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(users: List<PostDTO>)

    @Query("DELETE FROM Posts")
    suspend fun clearAll()
}