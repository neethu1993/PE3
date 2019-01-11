/**
 * Program to calculate first and last date of a week.
 */
package com.stackroute.p3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class WeekDate {

    /*Finds the first and last date of a week*/
    public String weekDateMethod() {
        String day="";
        DateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy EEE");

        //Finds today's date
        Calendar calendar = Calendar.getInstance();

        //Set the day as monday
        calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        day=formatDate.format(calendar.getTime())+"\n";

        //Increments the day by 6
        for (int i = 0; i < 6; i++) {
            calendar.add(Calendar.DATE, 1);
        }
        day = day + formatDate.format(calendar.getTime());
        return day;
    }
}