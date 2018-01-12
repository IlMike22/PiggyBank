package com.mwidlok.piggybank

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.mwidlok.piggybank.models.Transaction
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1Cent.setOnClickListener {
            Log.i("PiggyBank","Button 1 Cent clicked")
            var transaction = Transaction(0.01)
        }
    }
}
