package com.company;
import java.util.Date;

public class DateAndTime {
    public static void main(String[] args) {
//        System.out.println(System.currentTimeMillis()/(1000L *3600*24*365));
        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime());
    }
}
