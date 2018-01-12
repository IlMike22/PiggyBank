package com.mwidlok.piggybank.models
import android.util.Log
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*

/**
 * This class offers some convenience methods for showing custom alert dialog with different user options.
 */

class Transaction(var amount : Double)
{
    init {

        val currentDate = Calendar.getInstance()
        Log.i("PiggyBank", "Class Transaction was called.")
        Log.i("PiggyBank","The new object has a value of $amount and was set on $currentDate.")
        Log.i("Current Date is ", "${currentDate.get(Calendar.DAY_OF_YEAR)}.${currentDate.get(Calendar.MONTH)+1}.${currentDate.get(Calendar.YEAR)}")

        // todo schreibe in Datenbank




    }

}
