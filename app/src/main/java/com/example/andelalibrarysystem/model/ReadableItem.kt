package com.example.andelalibrarysystem.model

abstract class ReadableItem(val name: String,val numberOfPages: Int) {

    private val contentMap = HashMap<Int,String>()

    fun searchByKeyWord(searchQuery: String): String?{
        contentMap.filterValues {
            return if ( it.contains(searchQuery)){
               it
            }else {
                null
            }
        }
        return null
    }

    fun getContentOfPage(pageNumber: Int): String?{
        if (contentMap.containsKey(pageNumber))
            return contentMap[pageNumber]

        return null
    }

    abstract fun type(): ReadableItemTypes
}