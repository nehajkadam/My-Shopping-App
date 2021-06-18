package `in`.neha.mymart

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView

class ProductView(context: Context, attrs : AttributeSet?): LinearLayout(context, attrs) {

    lateinit var imgProduct: ImageView
    lateinit var txtProductTitle: TextView
    var product: Product? = null
        get() = field
        set(value) {
            field = value
            if (value != null) {
                imgProduct.setImageResource(product?.imageId!!)
                txtProductTitle.setText(product?.title)
            }
        }

    constructor(context: Context) : this(context, null)

    init {

        layoutParams = LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)

        var view = LayoutInflater.from(context)
                .inflate(R.layout.product_view, null)
        this.addView(view)

        imgProduct = view.findViewById(R.id.imgProduct)
        txtProductTitle = view.findViewById(R.id.txtProductName)
    }
}