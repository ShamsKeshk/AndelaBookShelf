package com.example.andelalibrarysystem.model

class NoteBook(name: String,
               numberOfPages: Int,
               val owner: String): ReadableItem(name,numberOfPages) {

    override fun type(): ReadableItemTypes {
        return ReadableItemTypes.NOTEBOOK
    }

}