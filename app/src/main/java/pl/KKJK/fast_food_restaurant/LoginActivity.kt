package pl.KKJK.fast_food_restaurant

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.register_button).setOnClickListener() {
            val login_intent = Intent(this, Register::class.java)
            startActivity(login_intent)
        }


    }
}