package com.mwidlok.piggybank

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.util.Log
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.mwidlok.piggybank.models.Transaction
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var sum : Double = 0.0
        var newSum : String = ""

        var mDatabase: DatabaseReference
        mDatabase = FirebaseDatabase.getInstance().reference
        mDatabase.child("id").setValue("Blubb")


        fun increaseSum(transaction : Transaction) : Double
        {
            sum += transaction.amount
            newSum = "%.2f Euro".format(sum)
            Log.i("PeggyBank","New sum is $newSum.")
            tvSum.setText(newSum)
            return sum
        }

        fun getCurrentDate() : String
        {
            val currentDate = Calendar.getInstance()
            return "${currentDate.get(Calendar.DAY_OF_YEAR)}.${currentDate.get(Calendar.MONTH)+1}.${currentDate.get(Calendar.YEAR)}"
        }

        btn1Cent.setOnClickListener {
            increaseSum(Transaction(0.01, getCurrentDate(), mDatabase))
        }

        btn2Cent.setOnClickListener {
            increaseSum(Transaction(0.02, getCurrentDate(), mDatabase))
        }

        btn5Cent.setOnClickListener {
            increaseSum(Transaction(0.05, getCurrentDate(), mDatabase))
        }

        btn10Cent.setOnClickListener {
            increaseSum(Transaction(0.1, getCurrentDate(), mDatabase))
        }

        btn20Cent.setOnClickListener {
            increaseSum(Transaction(0.2, getCurrentDate(), mDatabase))
        }

        btn50Cent.setOnClickListener {
            increaseSum(Transaction(0.5, getCurrentDate(), mDatabase))
        }

        btn1Euro.setOnClickListener {
            increaseSum(Transaction(1.0, getCurrentDate(), mDatabase))
        }

        btn2Euro.setOnClickListener {
            increaseSum(Transaction(2.0, getCurrentDate(), mDatabase))
        }
    }
}
