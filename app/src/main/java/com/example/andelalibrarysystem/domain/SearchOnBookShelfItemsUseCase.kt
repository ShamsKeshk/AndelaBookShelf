package com.example.andelalibrarysystem.domain

import com.example.andelalibrarysystem.data.BookShelfRepository
import com.example.andelalibrarysystem.model.ReadableItem
import javax.inject.Inject

class SearchOnBookShelfItemsUseCase @Inject constructor(private val repository: BookShelfRepository) {


    fun searchOnBookShelfBy(searchQuery: String): ReadableItem? {
        return repository
            .getBookShelf()
            .getReadableItem(searchQuery)
    }
}