package com.example.andelalibrarysystem.viewmodel

import androidx.lifecycle.ViewModel
import com.example.andelalibrarysystem.data.BookShelfRepository
import com.example.andelalibrarysystem.domain.ListBookShelfItemsUseCase
import com.example.andelalibrarysystem.model.ReadableItem

class BookShelfViewModel(private val listBookShelfItemsUseCase: ListBookShelfItemsUseCase): ViewModel() {

    fun getAllReadableItems(): List<ReadableItem> {
        return listBookShelfItemsUseCase.listBookShelfItems()
    }

}