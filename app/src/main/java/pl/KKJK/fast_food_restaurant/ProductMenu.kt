package pl.KKJK.fast_food_restaurant

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class ProductMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products_menu)

        val list = findViewById<ListView>(R.id.product_listView)
        var items = mutableListOf<Product>()

        val type = intent.getStringExtra(MainMenu.EXTRA_VALUE_NAME_1)


        for(product in Products.products){
            if(type == product.category)
            {
                val name = product.name
                val descripton = product.description
                val price = product.price
                val category = product.category

                val item = Product(name, descripton, price, category)

                items.add(item)
            }

            println(type)
        }

        val adapter = CustomAdapter(this, R.layout.product_listview, items)

        list.adapter = adapter

        list.setOnItemClickListener { parent, view, position, id ->

            val alert = AlertDialog.Builder(this)

            alert.setMessage("Dodano do koszyka").show()

            return@setOnItemClickListener
        }
    }
}