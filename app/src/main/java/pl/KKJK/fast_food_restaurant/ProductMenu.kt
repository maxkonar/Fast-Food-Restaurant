package pl.KKJK.fast_food_restaurant

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ListView
import android.widget.TextView

class ProductMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products_menu)

        var listView = findViewById<ListView>(R.id.main_listview)

        listView.adapter = ProductAdapter(this)
    }

    private class ProductAdapter(context: Context): BaseAdapter() {

        private var mContext:Context

        init {
            this.mContext = context
        }

        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            val textView = TextView(mContext)
            return textView
        }

        override fun getItem(position: Int): Any {
            return Products.products
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        override fun getCount(): Int {
            return Products.products.size
        }

    }
}