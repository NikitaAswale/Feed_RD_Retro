package com.example.feed_rd_retro

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [PostDTO::class], version = 1, exportSchema = false)
abstract class PostsDatabase : RoomDatabase() {
    abstract fun postDao(): postDAO
}