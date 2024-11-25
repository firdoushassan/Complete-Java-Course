package com.company;
import java.util.ArrayList;
import java.util.Iterator;

public class MyIterator {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("BMW");
        cars.add("Mazda");
        cars.add("Maruti");
        cars.add("Audi");
        cars.add("Ferrari");
        cars.add("Suzuki");

        Iterator<String> it = cars.iterator();
        System.out.println(it.next());
        System.out.println(it.next());
        Integer myInt = 100;
        String myString = myInt.toString();
        System.out.println(myInt.toString());
        System.out.println(myString.length());

    }
}
