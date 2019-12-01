package com.udacoding.firstkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //Todo : Tambah
        btnPlus.setOnClickListener {
//            val numb1 = numberOne.text.toString()
//            val numb2 = numberTwo.text.toString()
//
//            val hasil  = numb1.toDouble().plus(numb2.toDouble())
//
//            val alert = AlertDialog.Builder(this)
//            alert.setTitle("Hasil Adalah")
//            alert.setMessage(hasil.toString())
//            alert.show()
//
//            Log.d("Hasil Adalah : " , hasil.toString())

            showAlert("${calculate("Tambah")}")
            Log.d("Hasilnya Jumlah Adalah", "${calculate("Tambah")}")

        }

        //Todo : Kurang
        btnMinus.setOnClickListener {
            showAlert("${calculate("Kurang")}")
            Log.d("Hasilnya Kurang Adalah", "${calculate("Kurang")}")
        }

        //Todo : Kali
        btnTimes.setOnClickListener {
            showAlert("${calculate("Kali")}")
            Log.d("Hasilnya Kali Adalah", "${calculate("Kali")}")
        }

        //Todo : Bagi
        btnDiv.setOnClickListener {
            showAlert("${calculate("Bagi")}")
            Log.d("Hasilnya Bagi Adalah", "${calculate("Bagi")}")
        }

    }

    private fun calculate(operator : String) : Double{
        val numb1 = numberOne.text.toString().toDouble()
        val numb2 = numberTwo.text.toString().toDouble()

        var hasil = 0.0
        when (operator){
            "Tambah" -> hasil = numb1.plus(numb2)
            "Kurang" -> hasil = numb1.minus(numb2)
            "Kali" -> hasil = numb1.times(numb2)
            "Bagi" -> hasil = numb1.div(numb2)
        }
        return  hasil
    }

    private fun showAlert(msg : String){
        val alert = AlertDialog.Builder(this)
        alert.setTitle("Hasil nya Adalah")
        alert.setMessage(msg)
        alert.show()
    }
}
