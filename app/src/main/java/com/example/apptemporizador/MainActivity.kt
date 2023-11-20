package com.example.apptemporizador

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

        val editText: EditText = findViewById(R.id.edit_value)
        val buttonStart:   Button = findViewById(R.id.btn_start)
        val buttonStop:   Button = findViewById(R.id.btn_stop)
        val result: TextView = findViewById(R.id.txt_result)


        buttonStart.setOnClickListener {
           Toast.makeText(this, "Teste", Toast.LENGTH_SHORT).show()

        }
    }

}