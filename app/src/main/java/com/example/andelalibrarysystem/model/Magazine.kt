package com.example.andelalibrarysystem.model

class Magazine(name: String,
               numberOfPages: Int,
               private val publicationDate: String): ReadableItem(name,numberOfPages) {


    // Here we can add any extra Functionalities related to the Magazine



    override fun type(): ReadableItemTypes {
       return ReadableItemTypes.MAGAZINE
    }

}