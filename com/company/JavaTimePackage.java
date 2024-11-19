package com.company;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class JavaTimePackage {
    public static void main(String[] args) {
//        LocalDate d  = LocalDate.now();
//        System.out.println(d);
//        LocalTime t = LocalTime.now();
//        System.out.println(t);
//        LocalDateTime dt = LocalDateTime.now();
//        System.out.println(dt);

        //Format Date Time
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss a ---E");
        String Mydate = dt.format(df);
        System.out.println(Mydate);
    }
}
