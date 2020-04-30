package dev.chrismercer.coderswag.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import dev.chrismercer.coderswag.R
import dev.chrismercer.coderswag.adapters.CategoryAdapter
import dev.chrismercer.coderswag.model.Category
import dev.chrismercer.coderswag.services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapter(this, DataService.Categories)
        categoryListView.adapter = adapter
    }
}
