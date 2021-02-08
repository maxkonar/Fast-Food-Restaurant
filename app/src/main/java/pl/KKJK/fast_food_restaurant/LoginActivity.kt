package pl.KKJK.fast_food_restaurant

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.annotation.RequiresApi

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.P)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        fun login(){
            if(findViewById<EditText>(R.id.login_input).text.toString().isEmpty()){

            }
            else{

            }
        }

        findViewById<Button>(R.id.register_button).setOnClickListener() {
            val login_intent = Intent(this, Register::class.java)
            startActivity(login_intent)
        }

        findViewById<Button>(R.id.login_button).setOnClickListener() {
            login()
        }

    }
}

