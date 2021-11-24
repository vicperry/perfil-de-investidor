package com.engdacomp.perfildeinvestidor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1 = findViewById<Button>(R.id.next) as Button
        val nome = findViewById<EditText>(R.id.nome) as EditText

        btn1.setOnClickListener(View.OnClickListener {
            if (TextUtils.isEmpty(nome.text.toString())){
                nome.setError("Coloque seu nome.")
                return@OnClickListener
            }

            val intent = Intent(this@MainActivity,MainActivity3::class.java)

            val bundle = Bundle()

            val apresResult: String = ", seu perfil de investidor é: "

            bundle.putString("nome", nome.getText().toString() + apresResult)

            intent.putExtras(bundle)

            startActivity(intent)
    } )
    }
}