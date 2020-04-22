package com.example.coronapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_blue.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv_city1.setOnClickListener(View.OnClickListener{


            val intent = Intent(this, PinkyActivity::class.java)

            startActivity(intent)
        })



        tv_city2.setOnClickListener(View.OnClickListener{


            val intent = Intent(this, BlueActivity::class.java)

            startActivity(intent)
        })

        tv_city3.setOnClickListener(View.OnClickListener{


            val intent = Intent(this, GreenActivity::class.java)

            startActivity(intent)
        })
    }
}
