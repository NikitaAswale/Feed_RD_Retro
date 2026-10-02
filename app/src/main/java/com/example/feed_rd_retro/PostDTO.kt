package com.example.feed_rd_retro

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Posts")
data class PostDTO(
    val userId : Int,
    @PrimaryKey val id : Int,
    val title : String,
    val body : String
)
