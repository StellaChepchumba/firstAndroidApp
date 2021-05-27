package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var etNumber = findViewById<EditText>(R.id.etNumber)
        var etNumber2 = findViewById<EditText>(R.id.etNumber2)
        var btnmultiply = findViewById<Button>(R.id.btnmultiply)
        var btnadd = findViewById<Button>(R.id.btnadd)
        var btnmodulus = findViewById<Button>(R.id.btnmodulus)
        var btnsubtract = findViewById<Button>(R.id.btnsubtract)
        var tvtotal = findViewById<TextView>(R.id.tvtotal)

        btnmultiply.setOnClickListener {
            if (etNumber.text.toString() == "") {
                Toast.makeText(baseContext, "Enter a number", Toast.LENGTH_LONG).show()
            } else if (etNumber2.text.toString() == "") {
                Toast.makeText(baseContext, "Enter a number", Toast.LENGTH_LONG).show()
            } else {
                var number1 = etNumber.text.toString().toInt()
                var number2 = etNumber2.text.toString().toInt()
                var multiplication = number1 * number2
                tvtotal.text = "total${multiplication}"
            }
        }
        btnmodulus.setOnClickListener {
            if (etNumber.text.toString() == "") {
                Toast.makeText(baseContext, "Enter a number", Toast.LENGTH_LONG).show()
            } else if (etNumber2.text.toString() == "") {
                Toast.makeText(baseContext, "Enter a number", Toast.LENGTH_LONG).show()
            } else {
                var number1 = etNumber.text.toString().toInt()
                var number2 = etNumber2.text.toString().toInt()
                var modulus = number1 % number2
                tvtotal.text = "total${modulus}"
            }
        }
        btnadd.setOnClickListener {
            if (etNumber.text.toString() == "") {
                Toast.makeText(baseContext, "Enter a number", Toast.LENGTH_LONG).show()
            } else if (etNumber2.text.toString() == "") {
                Toast.makeText(baseContext, "Enter a number", Toast.LENGTH_LONG).show()
            } else {
                var number1 = etNumber.text.toString().toInt()
                var number2 = etNumber2.text.toString().toInt()
                var addition = number1 + number2
                tvtotal.text = "total${addition}"

            }
        }
        btnsubtract.setOnClickListener {
            if (etNumber.text.toString() == "") {
                Toast.makeText(baseContext, "Enter a number", Toast.LENGTH_LONG).show()
            } else if (etNumber2.text.toString() == "") {
                Toast.makeText(baseContext, "Enter a number", Toast.LENGTH_LONG).show()
            } else {
                var number1 = etNumber.text.toString().toInt()
                var number2 = etNumber2.text.toString().toInt()
                var subtraction = number1 - number2
                tvtotal.text = "total${subtraction}"

            }
        }
    }
}