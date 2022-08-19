package com.example.andelalibrarysystem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.andelalibrarysystem.data.BooksDataSource
import com.example.andelalibrarysystem.data.MagazineDataSource
import com.example.andelalibrarysystem.data.NoteBookDataSource
import com.example.andelalibrarysystem.model.BookShelf

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val bookShelf = BookShelf(1000)

        val listOfBooks = BooksDataSource.getLocalBook()
        val listOfMagazines = MagazineDataSource.getLocalMagazines()
        val listOfNoteBooks = NoteBookDataSource.getLocalNoteBooks()

        bookShelf.storeItemsToShelf(listOfBooks)

        bookShelf.storeItemsToShelf(listOfMagazines)

        bookShelf.storeItemsToShelf(listOfNoteBooks)
    }
}