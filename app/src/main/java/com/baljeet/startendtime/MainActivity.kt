package com.baljeet.startendtime

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.util.*


class MainActivity : AppCompatActivity() {

    val TAG = MainActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calendar = Calendar.getInstance()

        Log.d(TAG, "getStartOfDay: " + AppUtils.getStartOfDay(calendar.timeInMillis))
        Log.d(TAG, "getEndOfDay: " + AppUtils.getEndOfDay(calendar.timeInMillis))

        Log.d(TAG, "getStartOfWeek: " + AppUtils.getStartOfWeek(calendar.timeInMillis))
        Log.d(TAG, "getEndOfWeek: " + AppUtils.getEndOfWeek(calendar.timeInMillis))

        Log.d(TAG, "getStartOfMonth: " + AppUtils.getStartOfMonth(calendar.timeInMillis))
        Log.d(TAG, "getEndOfMonth: " + AppUtils.getEndOfMonth(calendar.timeInMillis))

        Log.d(TAG, "getStartOfYear: " + AppUtils.getStartOfYear(calendar.timeInMillis))
        Log.d(TAG, "getEndOfYear: " + AppUtils.getEndOfYear(calendar.timeInMillis))
    }
}
