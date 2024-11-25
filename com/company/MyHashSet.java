package com.company;
import java.util.*;

public class MyHashSet {
    public static void main(String[] args) {
        HashSet<String> h1 = new HashSet<>(6,0.8f);
        h1.add("BMW");
        h1.add("Mazda");
        h1.add("Ferrari");
        h1.add("Audi");
        h1.add("bmw");
        System.out.println(h1);

    }
}
