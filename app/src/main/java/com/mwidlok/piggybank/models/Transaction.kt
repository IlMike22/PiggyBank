package com.mwidlok.piggybank.models
import android.provider.SyncStateContract
import android.util.Log
import com.google.firebase.database.DatabaseReference
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*

/**
 * This class offers some convenience methods for showing custom alert dialog with different user options.
 */

class Transaction(var amount : Double, var date : String, val mDatabase : DatabaseReference)
{

//    companion object Factory {
//        fun create(): Transaction = Transaction(amount = 0.0, date = "01.01.1900")
//    }

    init {
        mDatabase.child("id").setValue("Blubb")
        // todo schreibe in Datenbank

    }

}
