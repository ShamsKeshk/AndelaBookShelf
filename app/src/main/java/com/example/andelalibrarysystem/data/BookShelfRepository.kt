package com.example.andelalibrarysystem.data

import com.example.andelalibrarysystem.data.local.BooksDataSource
import com.example.andelalibrarysystem.data.local.MagazineDataSource
import com.example.andelalibrarysystem.data.local.NoteBookDataSource
import com.example.andelalibrarysystem.model.BookShelf
import javax.inject.Inject

class BookShelfRepository @Inject constructor(private val bookDataSource: BooksDataSource,
                          private val magazineDataSource: MagazineDataSource,
                          private val noteBookDataSource: NoteBookDataSource) {


    private val bookShelf = BookShelf(1000)


    init {
      initBookShelfWithLocalProvidedData()
    }


    private fun initBookShelfWithLocalProvidedData() {
        bookShelf.storeItemsToShelf(bookDataSource.getLocalBooks())

        bookShelf.storeItemsToShelf(magazineDataSource.getLocalMagazines())

        bookShelf.storeItemsToShelf(noteBookDataSource.getLocalNoteBooks())
    }

    fun getBookShelf(): BookShelf = bookShelf







}