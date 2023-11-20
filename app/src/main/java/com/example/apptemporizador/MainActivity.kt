package com.example.apptemporizador

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.text.NumberFormat

class MainActivity : AppCompatActivity() {

    private var timer: CountDownTimer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText: EditText = findViewById(R.id.edit_value)
        val buttonStart:   Button = findViewById(R.id.btn_start)
        val buttonStop:   Button = findViewById(R.id.btn_stop)
        val result: TextView = findViewById(R.id.txt_result)


        buttonStart.setOnClickListener {
            try {
                val number = editText.text.toString().toLong()




            } catch (e: NumberFormatException){
                Toast.makeText(this, "Digite um número na caixa de texto", Toast.LENGTH_SHORT).show()


            }


        }
    }

}