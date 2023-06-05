package com.example.jeremy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

lateinit var myimage:ImageView

class ProductActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)

        myimage=findViewById(R.id.pizza)
        myimage.setOnClickListener {
            val myintent = Intent(this,PaymentActivity::class.java)
            startActivity(myintent)
        }
    }
}