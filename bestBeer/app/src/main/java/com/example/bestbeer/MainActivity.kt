package com.example.bestbeer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.buttonNext
import kotlinx.android.synthetic.main.activity_result.*
import kotlinx.android.synthetic.main.activity_second_beer.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonNext.setOnClickListener(View.OnClickListener{


            var name =et_beerName.text.toString()
            var price1 = et_price.text.toString().toDouble()
            var ml1 = et_mls.text.toString().toDouble()

            val beer1 =Beer(name,ml1,price1)

            val intent = Intent(this, SecondBeerActivity::class.java)
            intent.putExtra("beer1",beer1)
            startActivity(intent)
        })
    }

}
