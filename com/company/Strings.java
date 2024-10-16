package com.company;
import java.util.Scanner;

public class Strings {
    public static void main(String[] args){
/*
        String name = new String("Myself");
        String name  = "Myself";
        System.out.println(name);
*/
//        int a = 6;
//        float b = 5.6454f;
//        System.out.printf("The value of a is %d and the value of b is %f", a,b);
//        System.out.format("The value of a is %d and the value of b is %f", a,b);
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name);
    }
}
