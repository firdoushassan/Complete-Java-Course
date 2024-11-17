package com.company;
import java.util.*;

public class MyArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(5);
        l2.add(12);
        l2.add(15);
        l2.add(13);

        l1.add(6);
        l1.add(7);
        l1.add(4);
        l1.add(6);
        l1.add(0,5);
        l1.add(0,1);
//        for(int a:l1){
//            System.out.println(a);
//        }
        l1.addAll(4,l2);
//        l1.clear();
        System.out.println(l1.contains(6));
        System.out.println(l1.indexOf(6));
        System.out.println(l1.lastIndexOf(6));
        System.out.println(l1.size());
        l1.set(1,46);
        l1.remove(6);
        System.out.println(l1);
        System.out.println(l1.isEmpty());
    }
}
