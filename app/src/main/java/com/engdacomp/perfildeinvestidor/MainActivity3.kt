package com.engdacomp.perfildeinvestidor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val bundle = intent.extras

        val apresResult = findViewById<TextView>(R.id.apresResult) as TextView

        apresResult.setText(bundle!!.getCharSequence("nome"))
    }
}