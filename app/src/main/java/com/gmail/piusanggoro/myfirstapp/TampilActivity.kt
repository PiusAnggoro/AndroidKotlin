package com.gmail.piusanggoro.myfirstapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.util.*

class TampilActivity : AppCompatActivity() {
    companion object {
        const val ANGKA_TOTAL = "angka_total"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tampil)

        tampilBilanganAcak()
    }


    fun tampilBilanganAcak() {
        val hitung = intent.getIntExtra(ANGKA_TOTAL, 0)

        val acak = Random()
        var intAcak = 0
        if (hitung > 0) {
            intAcak = acak.nextInt(hitung + 1)
        }

        findViewById<TextView>(R.id.tvHasilAngka).text = Integer.toString(intAcak)
        //findViewById<TextView>(R.id.tvTampilTeks).text = getString(R.string.random_heading, count)
    }

}
