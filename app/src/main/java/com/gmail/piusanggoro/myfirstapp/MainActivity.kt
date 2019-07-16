package com.gmail.piusanggoro.myfirstapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun fungsiToast(view: View) {
        val textToast = Toast.makeText(this,"halo dunia",Toast.LENGTH_LONG)
        textToast.show()
    }

    fun fungsiHitung (view: View) {
        val textTampilAngka = findViewById<TextView>(R.id.tvTampilAngka)
        // findviewbyid diperbaiki dengan kotlin extension --> ktx

        val stringAngka = textTampilAngka.text.toString()

        var angka: Int = Integer.parseInt(stringAngka)
        angka++

        textTampilAngka.text = angka.toString();
    }

    fun acakSaya (view: View) {
        val textTampilAngka = findViewById<TextView>(R.id.tvTampilAngka)
        val stringHitung = textTampilAngka.text.toString()
        val hitung = Integer.parseInt(stringHitung)

        val intentAcak = Intent(this, TampilActivity::class.java)
        intentAcak.putExtra(TampilActivity.ANGKA_TOTAL, hitung)
        startActivity(intentAcak)
    }
}
