package com.example.feed_rd_retro

data class posts(
    val userId : Int,
    val id : Int,
    val title : String,
    val body : String
) {

    fun toEntity() = PostDTO(
        userId = userId,
        id = id,
        title = title,
        body = body
    )
}


