package com.example.andelalibrarysystem.data.local

import com.example.andelalibrarysystem.model.Magazine

class MagazineDataSource {


    fun getLocalMagazines(): List<Magazine> {

        val noteBooks = mutableListOf<Magazine>().apply {
            add(Magazine("Andela", 20, "19/08/2022"))
            add(Magazine("Andela", 30, "20/08/2022"))
            add(Magazine("Andela", 40, "21/08/2022"))
            add(Magazine("Andela", 25, "22/08/2022"))
        }

        return noteBooks
    }

}