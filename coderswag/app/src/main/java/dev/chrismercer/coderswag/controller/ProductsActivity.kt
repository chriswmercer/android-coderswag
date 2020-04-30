package dev.chrismercer.coderswag.controller

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import dev.chrismercer.coderswag.R
import dev.chrismercer.coderswag.adapters.ProductAdapter
import dev.chrismercer.coderswag.services.DataService
import dev.chrismercer.coderswag.utils.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_products.*

class ProductsActivity : AppCompatActivity() {

    lateinit var adapter: ProductAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        adapter = ProductAdapter(this, DataService.getProducts(categoryType))

        var spanCount = 2
        if (resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) spanCount = 3
        if (resources.configuration.screenWidthDp > 720) spanCount++

        val layoutManager = GridLayoutManager(this, spanCount)
        productListView.layoutManager = layoutManager
        productListView.adapter = adapter
    }
}
