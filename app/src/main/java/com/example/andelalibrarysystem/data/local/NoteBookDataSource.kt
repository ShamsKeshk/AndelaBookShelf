package com.example.andelalibrarysystem.data.local

import com.example.andelalibrarysystem.model.NoteBook
import com.example.andelalibrarysystem.model.ReadableItem
import javax.inject.Inject

class NoteBookDataSource @Inject constructor(){



    fun getLocalNoteBooks(): List<ReadableItem>{

        val noteBooks = mutableListOf<NoteBook>().apply {
            add(NoteBook("Andela",20,"Hossana"))
            add(NoteBook("Andela",30,"Samson"))
            add(NoteBook("Andela",40,"Shams"))
            add(NoteBook("Andela",25,"Sahar"))
        }

        return noteBooks
    }
}