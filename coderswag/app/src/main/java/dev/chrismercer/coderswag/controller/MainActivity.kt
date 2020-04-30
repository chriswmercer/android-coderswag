package dev.chrismercer.coderswag.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import dev.chrismercer.coderswag.R
import dev.chrismercer.coderswag.adapters.CategoryAdapter
import dev.chrismercer.coderswag.adapters.CategoryRecycleAdapter
import dev.chrismercer.coderswag.model.Category
import dev.chrismercer.coderswag.services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecycleAdapter(this, DataService.Categories)
        categoryListView.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        categoryListView.layoutManager = layoutManager
        categoryListView.setHasFixedSize(true)

        //for viewholder pattern to get clicked
        /*
        categoryListView.setOnItemClickListener { parent, view, position, id ->
            val category = DataService.Categories[position]
        }
         */
    }
}
