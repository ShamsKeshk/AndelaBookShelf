package com.example.andelalibrarysystem.model

class Magazine(name: String,
               numberOfPages: Int,
               private val publicationDate: String): ReadableItem(name,numberOfPages) {

    override fun type(): ReadableItemTypes {
       return ReadableItemTypes.MAGAZINE
    }

}