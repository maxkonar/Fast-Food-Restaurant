package pl.KKJK.fast_food_restaurant

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.cardview.widget.CardView

class MainMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)
    }

    fun goToCorrectSubMenu(view: View){
        if (view.id == R.id.drinks_card){
            val drinks_intent = Intent(this, ProductMenu::class.java)
            startActivity(drinks_intent)
            var type = "Drinks"
        }
        if (view.id == R.id.hot_drinks_card){
            val drinks_intent = Intent(this, ProductMenu::class.java)
            startActivity(drinks_intent)
            var type = "Hot Drinks"
        }
        if (view.id == R.id.burgers_card){
            val drinks_intent = Intent(this, ProductMenu::class.java)
            startActivity(drinks_intent)
            var type = "Burgers"
        }
        if (view.id == R.id.salad_card){
            val drinks_intent = Intent(this, ProductMenu::class.java)
            startActivity(drinks_intent)
            var type = "Salad"
        }
    }
}