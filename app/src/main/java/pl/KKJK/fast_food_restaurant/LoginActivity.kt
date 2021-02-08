package pl.KKJK.fast_food_restaurant

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        fun nameAndPasswordChecker(){
            var login = findViewById<EditText>(R.id.login_input).text
            var password = findViewById<EditText>(R.id.password_input).text
            for (customer in Customers.customers){
                if (customer.Login == login.toString() && customer.Password == password.toString() ) {
                    val login_intent = Intent(this, MainMenu::class.java)
                    startActivity(login_intent)
                }
            }
        }

        findViewById<Button>(R.id.login_button).setOnClickListener() {
            nameAndPasswordChecker()
        }
    }
}