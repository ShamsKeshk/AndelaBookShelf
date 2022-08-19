package com.example.andelalibrarysystem.viewmodel

import androidx.lifecycle.ViewModel
import com.example.andelalibrarysystem.domain.ListBookShelfItemsUseCase
import com.example.andelalibrarysystem.domain.SearchOnBookShelfItemsUseCase
import com.example.andelalibrarysystem.model.ReadableItem
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class BookShelfViewModel @Inject constructor(private val listBookShelfItemsUseCase: ListBookShelfItemsUseCase,
                                             private val searchOnBookShelfItemsUseCase: SearchOnBookShelfItemsUseCase)
    : ViewModel() {

    fun getAllReadableItems(): List<ReadableItem> {
        return listBookShelfItemsUseCase.listBookShelfItems()
    }

    fun getItemBy(searchQuery: String): ReadableItem?{
        return searchOnBookShelfItemsUseCase.searchOnBookShelfBy(searchQuery)
    }

}