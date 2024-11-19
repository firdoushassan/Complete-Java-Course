package com.company;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Calender_class {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
//        System.out.println(c.getCalendarType());
//        System.out.println(c.getTimeZone());
//        Calendar c = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
//        System.out.println(c.getCalendarType());
//        System.out.println(c.getTimeZone());
//        Calendar c = Calendar.getInstance();
//        System.out.println(c.get(Calendar.DATE));
//        System.out.println(c.get(Calendar.SECOND));
//        System.out.println(c.get(Calendar.HOUR_OF_DAY));
        GregorianCalendar gc = new GregorianCalendar();
        System.out.println(gc.isLeapYear(2025));




    }
}
