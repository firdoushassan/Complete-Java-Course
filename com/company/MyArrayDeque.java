package com.company;
import java.util.*;

public class MyArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(6);
        ad1.add(56);
        ad1.add(22);
        ad1.add(31);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());

//        -------------------------------------------------------//
        System.out.println(ad1);
        System.out.print("Array : ");
        for(int a : ad1){
            System.out.print(a+ " ");
        }
    }
}
