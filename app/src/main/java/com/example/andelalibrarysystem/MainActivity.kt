package com.example.andelalibrarysystem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.andelalibrarysystem.data.local.BooksDataSource
import com.example.andelalibrarysystem.data.local.MagazineDataSource
import com.example.andelalibrarysystem.data.local.NoteBookDataSource
import com.example.andelalibrarysystem.model.BookShelf
import com.example.andelalibrarysystem.viewmodel.BookShelfViewModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bookShelfViewModel = ViewModelProvider(this).get(BookShelfViewModel::class.java)
    }
}