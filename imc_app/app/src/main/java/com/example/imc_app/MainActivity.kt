package com.example.imc_app

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import kotlinx.android.synthetic.main.activity_main.*
import java.text.DecimalFormat
import com.example.imc_app.dadosIMC as dadosIMC

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main )

        bt_calcular.setOnClickListener {

            if(etPeso.text.toString() != "" && etAltura.text.toString() != "" ) {
                val imc =
                    etPeso.text.toString().toDouble() /
                            (etAltura.text.toString().toDouble() * etAltura.text.toString().toDouble())
                val df = DecimalFormat("#.00")
                val imcResp = "IMC: " + df.format(imc) + "\n" + checkIMC(imc)
                tvResp.text = imcResp
            }else{
                tvResp.text = "Valores nulos."
            }

            var dados =dadosIMC(etAltura.text.toString(),etPeso.text.toString())
            val intent=Intent(this,resultadoActivity::class.java)
            intent.putExtra("dados",dados)
            intent.putExtra("imc", imc)
            startActivity(intent)
        }

    }

    fun checkIMC(bd: Double): String{
        when(bd){
            in 0..17 -> return "Muito abaixo do peso."
            in 17.0..18.49 -> return "Abaixo do peso."
            in 18.5..24.99 -> return "com Peso normal."
            in 25.0..29.99 ->  return "Acima do peso."
            in 30.0..34.99 -> return "com Obesidade I."
            in 35.0..39.99 -> return "com Obesidade II(severa)."
            else -> return "com Obesidade III(mórbida)."
        }
    }
}
