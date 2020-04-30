package dev.chrismercer.coderswag.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import dev.chrismercer.coderswag.R
import dev.chrismercer.coderswag.model.Product
import kotlinx.android.synthetic.main.product_list_list_item.view.*

class ProductAdapter(private val context: Context, private val products: List<Product>) : RecyclerView.Adapter<ProductAdapter.Holder>(){

    inner class Holder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val productImage = itemView.findViewById<ImageView>(R.id.imageView)
        val productDesciption = itemView.findViewById<TextView>(R.id.descriptionLabel)
        val productPrice = itemView.findViewById<TextView>(R.id.priceLabel)

        fun bindProduct(product: Product, context: Context) {
            val resourceId = context.resources.getIdentifier(product.image, "drawable", context.packageName)
            productImage?.setImageResource(resourceId)
            productDesciption?.text = product.title
            productPrice?.text = product.price
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(context).inflate(R.layout.product_list_list_item, parent, false)
        return Holder(view)
    }

    override fun getItemCount(): Int {
        return products.count()
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder?.bindProduct(products[position], context)
    }
}