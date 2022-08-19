package com.example.andelalibrarysystem.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.andelalibrarysystem.R
import com.example.andelalibrarysystem.viewmodel.BookShelfViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bookShelfViewModel = ViewModelProvider(this).get(BookShelfViewModel::class.java)
    }
}