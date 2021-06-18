package `in`.neha.mymart

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeFragment : Fragment() {

    var products: ArrayList<Product> = ArrayList()
    lateinit var recyclerProducts: RecyclerView
    lateinit var productsAdapter: ProductAdapter


    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        var view = inflater.inflate(R.layout.home_frag_layout, null)



        products.add(Product(R.drawable.mob3, "Redme"))
        products.add(Product(R.drawable.mob4, "iPhone"))
        products.add(Product(R.drawable.curten1, "Silk"))
        products.add(Product(R.drawable.curten2, "Cotton"))
        products.add(Product(R.drawable.dress1, "Frock"))
        products.add(Product(R.drawable.dress2, "Frock"))
        products.add(Product(R.drawable.headphone1, "Boate"))
        products.add(Product(R.drawable.headphone2, "HP"))
        products.add(Product(R.drawable.tv1, "LG"))
        products.add(Product(R.drawable.tv2, "LED"))

        fun init() {
            recyclerProducts = view.findViewById(R.id.recyclerviewImg)

            recyclerProducts.layoutManager =
                    LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
            productsAdapter = ProductAdapter(products)
            recyclerProducts.adapter = productsAdapter
        }

        return view
    }
}



