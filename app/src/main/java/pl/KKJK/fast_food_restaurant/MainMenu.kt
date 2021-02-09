package pl.KKJK.fast_food_restaurant


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View


class MainMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)

        val stateValue = savedInstanceState?.getString(STATE_VALUE_1)
    }

    companion object {

        const val STATE_VALUE_1 = "SV1"

        const val EXTRA_VALUE_NAME_1 = "EV1"
    }

    fun goToCorrectSubMenu(view: View) {
        if (view.id == R.id.drinks_card){
            val intent = Intent(this, ProductMenu::class.java)
            intent.putExtra(EXTRA_VALUE_NAME_1, "Drinks")
            startActivity(intent)

        }
        if (view.id == R.id.hot_drinks_card){
            val intent = Intent(this, ProductMenu::class.java)
            intent.putExtra(EXTRA_VALUE_NAME_1, "Hot Drinks")
            startActivity(intent)

        }
        if (view.id == R.id.burgers_card){
            val intent = Intent(this, ProductMenu::class.java)
            intent.putExtra(EXTRA_VALUE_NAME_1, "Burgers")
            startActivity(intent)

        }
        if (view.id == R.id.salad_card){
            val intent = Intent(this, ProductMenu::class.java)
            intent.putExtra(EXTRA_VALUE_NAME_1, "Salad")
            startActivity(intent)
        }
    }
}