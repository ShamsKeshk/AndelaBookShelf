package com.example.andelalibrarysystem.model

class NoteBook(name: String,
               numberOfPages: Int,
               val owner: String): ReadableItem(name,numberOfPages) {


    // Here we can add any extra Functionalities related to the NoteBook


    override fun type(): ReadableItemTypes {
        return ReadableItemTypes.NOTEBOOK
    }

}