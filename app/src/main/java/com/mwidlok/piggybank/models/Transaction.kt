package com.mwidlok.piggybank.models
import android.provider.SyncStateContract
import android.util.Log
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*

/**
 * This class offers some convenience methods for showing custom alert dialog with different user options.
 */

class Transaction(var amount : Double, var date : String)
{

    init {

        var mDatabase: DatabaseReference
        mDatabase = FirebaseDatabase.getInstance().reference
        val key = mDatabase.child("transactions").push().key

        Log.i("PiggyBank","new key of value is $key")
        mDatabase.child("entries").child(key).setValue(this)
    }

}
