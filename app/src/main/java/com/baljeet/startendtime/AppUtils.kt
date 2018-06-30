package com.baljeet.startendtime

import java.util.*

object AppUtils {
    fun getStartOfDay(timeMillis : Long) : Long {
        val calendar = Calendar.getInstance()
        calendar.timeInMillis = timeMillis
        calendar.set(Calendar.HOUR_OF_DAY, calendar.getMinimum(Calendar.HOUR_OF_DAY))
        calendar.set(Calendar.MINUTE,  calendar.getMinimum(Calendar.MINUTE))
        calendar.set(Calendar.SECOND,  calendar.getMinimum(Calendar.SECOND))
        calendar.set(Calendar.MILLISECOND,  calendar.getMinimum(Calendar.MILLISECOND))
        return calendar.timeInMillis
    }

    fun getEndOfDay(timeMillis: Long) : Long {
        val  calendar = Calendar.getInstance()
        calendar.timeInMillis = timeMillis
        calendar.set(Calendar.HOUR_OF_DAY, calendar.getMaximum(Calendar.HOUR_OF_DAY))
        calendar.set(Calendar.MINUTE,  calendar.getMaximum(Calendar.MINUTE))
        calendar.set(Calendar.SECOND,  calendar.getMaximum(Calendar.SECOND))
        calendar.set(Calendar.MILLISECOND,  calendar.getMaximum(Calendar.MILLISECOND))
        return calendar.timeInMillis
    }

    fun getStartOfWeek(timeMillis : Long) : Long {
        val calendar = Calendar.getInstance()
        calendar.timeInMillis = timeMillis
        calendar.set(Calendar.DAY_OF_WEEK, calendar.getActualMinimum(Calendar.DAY_OF_WEEK))
        calendar.set(Calendar.HOUR_OF_DAY, calendar.getMinimum(Calendar.HOUR_OF_DAY))
        calendar.set(Calendar.MINUTE,  calendar.getMinimum(Calendar.MINUTE))
        calendar.set(Calendar.SECOND,  calendar.getMinimum(Calendar.SECOND))
        calendar.set(Calendar.MILLISECOND,  calendar.getMinimum(Calendar.MILLISECOND))
        return calendar.timeInMillis
    }

    fun getEndOfWeek(timeMillis: Long) : Long {
        val  calendar = Calendar.getInstance()
        calendar.timeInMillis = timeMillis
        calendar.set(Calendar.DAY_OF_WEEK, calendar.getActualMaximum(Calendar.DAY_OF_WEEK))
        calendar.set(Calendar.HOUR_OF_DAY, calendar.getMaximum(Calendar.HOUR_OF_DAY))
        calendar.set(Calendar.MINUTE,  calendar.getMaximum(Calendar.MINUTE))
        calendar.set(Calendar.SECOND,  calendar.getMaximum(Calendar.SECOND))
        calendar.set(Calendar.MILLISECOND,  calendar.getMaximum(Calendar.MILLISECOND))
        return calendar.timeInMillis
    }

    fun getStartOfMonth(timeMillis : Long) : Long {
        val calendar = Calendar.getInstance()
        calendar.timeInMillis = timeMillis
        calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMinimum(Calendar.DAY_OF_MONTH))
        calendar.set(Calendar.HOUR_OF_DAY, calendar.getMinimum(Calendar.HOUR_OF_DAY))
        calendar.set(Calendar.MINUTE,  calendar.getMinimum(Calendar.MINUTE))
        calendar.set(Calendar.SECOND,  calendar.getMinimum(Calendar.SECOND))
        calendar.set(Calendar.MILLISECOND,  calendar.getMinimum(Calendar.MILLISECOND))
        return calendar.timeInMillis
    }

    fun getEndOfMonth(timeMillis: Long) : Long {
        val  calendar = Calendar.getInstance()
        calendar.timeInMillis = timeMillis
        calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH))
        calendar.set(Calendar.HOUR_OF_DAY, calendar.getMaximum(Calendar.HOUR_OF_DAY))
        calendar.set(Calendar.MINUTE,  calendar.getMaximum(Calendar.MINUTE))
        calendar.set(Calendar.SECOND,  calendar.getMaximum(Calendar.SECOND))
        calendar.set(Calendar.MILLISECOND,  calendar.getMaximum(Calendar.MILLISECOND))
        return calendar.timeInMillis
    }

    fun getStartOfYear(timeMillis : Long) : Long {
        val calendar = Calendar.getInstance()
        calendar.timeInMillis = timeMillis
        calendar.set(Calendar.DAY_OF_YEAR, calendar.getActualMinimum(Calendar.DAY_OF_YEAR))
        calendar.set(Calendar.HOUR_OF_DAY, calendar.getMinimum(Calendar.HOUR_OF_DAY))
        calendar.set(Calendar.MINUTE,  calendar.getMinimum(Calendar.MINUTE))
        calendar.set(Calendar.SECOND,  calendar.getMinimum(Calendar.SECOND))
        calendar.set(Calendar.MILLISECOND,  calendar.getMinimum(Calendar.MILLISECOND))
        return calendar.timeInMillis
    }

    fun getEndOfYear(timeMillis: Long) : Long {
        val  calendar = Calendar.getInstance()
        calendar.timeInMillis = timeMillis
        calendar.set(Calendar.DAY_OF_YEAR, calendar.getActualMaximum(Calendar.DAY_OF_YEAR))
        calendar.set(Calendar.HOUR_OF_DAY, calendar.getMaximum(Calendar.HOUR_OF_DAY))
        calendar.set(Calendar.MINUTE,  calendar.getMaximum(Calendar.MINUTE))
        calendar.set(Calendar.SECOND,  calendar.getMaximum(Calendar.SECOND))
        calendar.set(Calendar.MILLISECOND,  calendar.getMaximum(Calendar.MILLISECOND))
        return calendar.timeInMillis
    }
}