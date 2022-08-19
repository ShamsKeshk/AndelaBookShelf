package com.example.andelalibrarysystem.domain

import com.example.andelalibrarysystem.data.BookShelfRepository
import com.example.andelalibrarysystem.model.ReadableItem
import javax.inject.Inject

class ListBookShelfItemsUseCase @Inject constructor(private val repository: BookShelfRepository) {


    fun listBookShelfItems(): List<ReadableItem> {
        return repository
            .getBookShelf()
            .getAllItems()
    }
}