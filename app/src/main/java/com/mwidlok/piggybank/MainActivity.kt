package com.mwidlok.piggybank

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.mwidlok.piggybank.models.Transaction
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var sum : Double = 0.0
        var newSum : String = ""

        fun increaseSum(transaction : Transaction) : Double
        {
            sum += transaction.amount
            newSum = "%.2f Euro".format(sum)
            Log.i("PiggyBank","New sum is $newSum.")
            tvSum.setText(newSum)
            return sum
        }

        fun getCurrentDate() : String
        {
            val currentDate = Calendar.getInstance()
            return "${currentDate.get(Calendar.DAY_OF_YEAR)}.${currentDate.get(Calendar.MONTH)+1}.${currentDate.get(Calendar.YEAR)}"
        }

        btn1Cent.setOnClickListener {
            increaseSum(Transaction( 0.01, getCurrentDate()))
        }

        btn2Cent.setOnClickListener {
            increaseSum(Transaction(0.02, getCurrentDate()))
        }

        btn5Cent.setOnClickListener {
            increaseSum(Transaction(0.05, getCurrentDate()))
        }

        btn10Cent.setOnClickListener {
            increaseSum(Transaction( 0.1, getCurrentDate()))
        }

        btn20Cent.setOnClickListener {
            increaseSum(Transaction( 0.2, getCurrentDate()))
        }

        btn50Cent.setOnClickListener {
            increaseSum(Transaction(0.5, getCurrentDate()))
        }

        btn1Euro.setOnClickListener {
            increaseSum(Transaction(1.0, getCurrentDate()))
        }

        btn2Euro.setOnClickListener {
            increaseSum(Transaction(2.0, getCurrentDate()))
        }
    }
}
