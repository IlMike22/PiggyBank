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

        var sum : Double = 0.0
        var newSum : String = ""

        fun increaseSum(transaction : Transaction) : Double
        {
            sum += transaction.amount
            newSum = "%.2f".format(sum)
            Log.i("PeggyBank","New sum is $newSum.")
            tvSum.setText(newSum)
            return sum
        }

        btn1Cent.setOnClickListener {
            increaseSum(Transaction(0.01))
        }

        btn2Cent.setOnClickListener {
            increaseSum(Transaction(0.02))
        }

        btn5Cent.setOnClickListener {
            increaseSum(Transaction(0.05))
        }

        btn10Cent.setOnClickListener {
            increaseSum(Transaction(0.1))
        }

        btn20Cent.setOnClickListener {
            increaseSum(Transaction(0.2))
        }

        btn50Cent.setOnClickListener {
            increaseSum(Transaction(0.5))
        }

        btn1Euro.setOnClickListener {
            increaseSum(Transaction(1.0))
        }

        btn2Euro.setOnClickListener {
            increaseSum(Transaction(2.0))
        }
    }
}
