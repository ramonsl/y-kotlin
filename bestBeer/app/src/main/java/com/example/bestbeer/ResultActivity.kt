package com.example.bestbeer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_result.*
import kotlinx.android.synthetic.main.activity_result.backButton
import kotlinx.android.synthetic.main.activity_second_beer.*

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        Log.e("Exibir", "TESTE3")

        val beer1 = intent.getParcelableExtra<Beer>("beer1")
        val beer2 = intent.getParcelableExtra<Beer>("beer2")


        if(beer1.calculateBeer()>beer2.calculateBeer()){
            val msg="A ceverja ${beer2.name} está mais barata que:${beer1.name}"
            compared.text=msg
            txtValue.text=beer2.price.toString()
        }else{
            val msg="A ceverja ${beer1.name} está mais barata que:${beer2.name}"

            compared.text=msg

            txtValue.text=beer1.price.toString()
        }



        backButton.setOnClickListener() {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
