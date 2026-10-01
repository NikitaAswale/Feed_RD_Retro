package com.example.feed_rd_retro

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.compose.viewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class post_viewmodel : ViewModel() {

    private val repository = Post_Repository()

    private val _posts = MutableStateFlow<List<posts>>(emptyList())

    val posts : StateFlow<List<posts>> = _posts

    init {
        fetchposts()
    }

    fun fetchposts(){
        viewModelScope.launch {
            _posts.value = repository.getposts()
        }
    }
}