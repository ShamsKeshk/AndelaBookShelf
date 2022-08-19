package com.example.andelalibrarysystem.data

import com.example.andelalibrarysystem.model.Book

class BooksDataSource {

    companion object{

        fun getLocalBook(): List<Book>{

            val noteBooks = mutableListOf<Book>().apply {
                add(Book("Andela",20,"Hossana"))
                add(Book("Andela",30,"Samson"))
                add(Book("Andela",40,"shams"))
                add(Book("Andela",25,"sahar"))
            }

            return noteBooks
        }
    }
}