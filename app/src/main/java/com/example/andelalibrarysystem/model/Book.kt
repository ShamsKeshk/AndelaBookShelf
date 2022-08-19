package com.example.andelalibrarysystem.model

class Book(title: String,
           numberOfPages: Int,
           private val author: String)
    : ReadableItem(title,numberOfPages) {

    // Here we can add any extra Functionalities related to the Book


    override fun type(): ReadableItemTypes {
       return ReadableItemTypes.BOOK
    }

}