package com.example.feed_rd_retro

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.room.Insert
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class post_viewmodel @Inject constructor(
    private val repository: Post_Repository
): ViewModel() {

    private val _posts = MutableStateFlow<List<PostDTO>>(emptyList())

    val posts : StateFlow<List<PostDTO>> = _posts

    init {
        observePosts()
        refresh()
    }

    private fun observePosts() {
        viewModelScope.launch {
            repository.getPosts().collect { posts ->
                _posts.value = posts
            }
        }
    }

    fun refresh() {
        viewModelScope.launch {
            repository.refreshUsers()
        }
    }
}