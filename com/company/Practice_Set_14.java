package com.company;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Practice_Set_14 {
    public static void main(String[] args) {

        //Problem
//        ArrayList<String> stname = new ArrayList<>();
//        stname.add("one");stname.add("two");stname.add("three");
//        stname.add("four");stname.add("five");stname.add("six");
//        stname.add("seven");stname.add("eight");stname.add("nine");
//        stname.add("ten");
//        for(Object a :stname){
//            System.out.print(a+ " ");
//        }

        //Problem
//        LocalTime lt = LocalTime.now();
//        DateTimeFormatter lf = DateTimeFormatter.ofPattern("hh:mm:ss");
//        System.out.println(lt.format(lf));

        //Problem
//        HashSet<Integer> st = new HashSet<>();
//        st.add(23);
//        st.add(33);
//        st.add(14);
//        st.add(14);
//        st.add(18);
//        System.out.println(st);

        //Problem
        Date d = new Date();
        System.out.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());

        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)
                +":"+c.get(Calendar.SECOND));


    }
}
