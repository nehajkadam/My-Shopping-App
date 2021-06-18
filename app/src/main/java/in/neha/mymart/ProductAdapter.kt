package `in`.neha.mymart

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ProductAdapter(var products: ArrayList<Product>) :  RecyclerView.Adapter<ProductAdapter.ProductViewHolder>(){

    class ProductViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var productView: ProductView = itemView as ProductView

    }

    override fun getItemCount(): Int = products.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        return ProductViewHolder(
                LayoutInflater.from(parent.context).inflate(R.layout.product_view, null)
        )
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        var product = products.get(position)

    }
}
