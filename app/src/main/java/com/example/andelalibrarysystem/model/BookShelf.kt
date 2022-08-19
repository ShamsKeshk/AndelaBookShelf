package com.example.andelalibrarysystem.model

import androidx.annotation.RequiresPermission.Read

class BookShelf(val capacity: Int) {


    private val readableItems = mutableListOf<ReadableItem>()

    fun storeItemsToShelf(readableItem: List<ReadableItem>): Boolean{
        if (isShelfCanAddMoreItems(readableItem)) {
            readableItems.addAll(readableItem)
            return true
        }

        return false
    }

    fun storeItemToShelf(readableItem: ReadableItem): Boolean{
        if (isShelfCanAddMoreItem()) {
            readableItems.add(readableItem)
            return true
        }

        return false
    }

    fun removeItemFromShelf(readableItem: ReadableItem){
        readableItems.remove(readableItem)
    }

    fun getAllItems(): List<ReadableItem>{
        return readableItems
    }

    fun getReadableItem(searchQuery: String): ReadableItem?{
        return readableItems.find {
            it.searchByKeyWord(searchQuery) != null
        }
    }

    fun getCurrentItemsSize(): Int{
        return readableItems.size
    }

    fun getHowManyItemsToAdd(): Int{
        return capacity - readableItems.size
    }

    fun getShelfCapacity(): Int{
        return capacity
    }

    fun isShelfCanAddMoreItem(): Boolean{
        return getHowManyItemsToAdd() > 0
    }

    fun isShelfCanAddMoreItems(list: List<ReadableItem>): Boolean{
        return getHowManyItemsToAdd() > list.size
    }
}