package com.example.bestbeer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.buttonNext
import kotlinx.android.synthetic.main.activity_second_beer.*

class SecondBeerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_beer)

        buttonNext.setOnClickListener() {


            val intent = Intent(this, ResultActivity::class.java)
            startActivity(intent)
        }

        backButton.setOnClickListener() {


            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
