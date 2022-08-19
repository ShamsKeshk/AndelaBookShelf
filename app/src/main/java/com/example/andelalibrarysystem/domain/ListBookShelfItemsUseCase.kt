package com.example.andelalibrarysystem.domain

import com.example.andelalibrarysystem.data.BookShelfRepository
import com.example.andelalibrarysystem.model.ReadableItem

class ListBookShelfItemsUseCase(private val repository: BookShelfRepository) {


    fun listBookShelfItems(): List<ReadableItem> {
        return repository
            .getBookShelf()
            .getAllItems()
    }
}