package pl.KKJK.fast_food_restaurant

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import pl.KKJK.fast_food_restaurant.Product

class CustomAdapter(context: Context, val resource: Int, val objects: MutableList<Product>) : ArrayAdapter<Product>(context, resource, objects) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val inflater = LayoutInflater.from(context)

        val itemView = inflater.inflate(resource, parent, false)

        val textViewName = itemView.findViewById<TextView>(R.id.textViewName)
        val textViewDescripton = itemView.findViewById<TextView>(R.id.textViewDescription)
        val textViewPrice = itemView.findViewById<TextView>(R.id.textViewPrice)

        val item = objects[position]

        if (item != null)
        {
            textViewName.text = item.name
            textViewDescripton.text = item.description
            textViewPrice.text = item.price.toString() + "zł"
        }

        return itemView
    }
}