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


            var price1 = et_price.text.toString().toDouble()
            var ml1 = et_mls.text.toString().toDouble()



            if(price1.toString().isNotEmpty() && ml1.toString().isNotEmpty()){
                var firstBeerResult = (price1/ml1)*1000

            }



            val intent = Intent(this, SecondBeerActivity::class.java)

            startActivity(intent)
        })
    }

}
