package com.example.bestbeer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.buttonNext
import kotlinx.android.synthetic.main.activity_result.*
import kotlinx.android.synthetic.main.activity_second_beer.*
import kotlinx.android.synthetic.main.activity_second_beer.backButton

class SecondBeerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_beer)


        val beer1 =intent.getParcelableExtra<Beer>("beer1")


        Log.e("Exibir", beer1.name)

        buttonNext.setOnClickListener() {

            Log.e("Exibir", "TESTE")
            var name =et_beerName2.text.toString()
            var price1 = et_price2.text.toString().toDouble()
            var ml1 = et_mls2.text.toString().toDouble()

            val beer2 =Beer(name,ml1,price1)

            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("beer1",beer1)
            intent.putExtra("beer2",beer2)
            Log.e("Exibir", "TESTE2")

            startActivity(intent)

        }


        //backButton
     /*   backButton.setOnClickListener() {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }*/
    }
}
