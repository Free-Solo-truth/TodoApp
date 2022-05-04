package com.example.todoapp.fragment.detail

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.example.todoapp.data.TodoRepository
import com.example.todoapp.data.model.TagData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class DetailViewModel(application: Application):AndroidViewModel(application) {
    private val repository = TodoRepository(application)
    var tagList:LiveData<List<TagData>> = repository.getAllTags()

    fun insertTag(tagData: TagData){
        viewModelScope.launch (Dispatchers.IO){
            repository.insertTag(tagData)
        }
    }
}