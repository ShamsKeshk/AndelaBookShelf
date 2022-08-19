package com.example.andelalibrarysystem.model

class Book(title: String,
           numberOfPages: Int,
           private val author: String)
    : ReadableItem(title,numberOfPages) {


    override fun type(): ReadableItemTypes {
       return ReadableItemTypes.BOOK
    }

}