package com.example.imc_app

import android.annotation.SuppressLint
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.view.View
import android.view.inputmethod.InputMethodManager
import kotlinx.android.synthetic.main.activity_main.*
import java.text.DecimalFormat

class resultadoActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val dados=intent.getParcelableExtra<dadosIMC>("dados")
        val imc = intent.getStringExtra("imc")
        val imcResp = intent.getStringExtra("imcResp")



        tvResp.text = "seu peso é ${dados.etPeso.toString()} e seu IMC é $imc e está $imcResp"
    }


}


