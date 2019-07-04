package com.stackroute.pe3;

import java.util.Calendar;
import java.util.GregorianCalendar;

import static java.util.Calendar.DAY_OF_WEEK;
import static java.util.Calendar.MONDAY;

    public class FirstAndLastDayOfWeek {


        //Calendar class is instantiated
        Calendar calendar=Calendar.getInstance();


        //In this method the calendar of specific week sets
        public void setCal(int year,int mon,int date) {

            calendar.set(year,mon,date);
        }

        //Getting the first day of the week
        public String getFirstDay()
        {
            calendar.add(Calendar.DATE,-calendar.get(DAY_OF_WEEK)+2);

            return  "Monday" +" "+calendar.get(Calendar.DATE)+" "+calendar.get(Calendar.MONTH)+" "+calendar.get(Calendar.YEAR);
        }

        //Getting the last day of the week
        public String getLastDay()
        {
            calendar.add(Calendar.DATE,6);
            return  "Sunday" +" "+calendar.get(GregorianCalendar.DATE)+" "+calendar.get(GregorianCalendar.MONTH)+" "+calendar.get(GregorianCalendar.YEAR);
        }


    }

