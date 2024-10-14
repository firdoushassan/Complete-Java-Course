package com.company;

import java.util.Scanner;

public class Practice_Set_1 {
    public static void main(String[] args) {
        //Question 1
//        float subject1 = 45;
//        float subject2 = 95;
//        float subject3 = 48;
//        float cgpa = (subject1+subject2+subject3)/30;
//        System.out.println(cgpa);
        //Question 2
//        System.out.println("What is your name ?");
//        Scanner sc = new Scanner(System.in);
//        String name = sc.next();
//        System.out.println("Hello " +name+ " have a good day!");
        //Question 3
//        System.out.println("Enter a Integer");
//        Scanner sc = new Scanner(System.in);
//        System.out.println(sc.hasNextInt());
        //Question 4
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter distance in Kilometers");
        float distKM = sc.nextFloat();
        float distMiles = distKM*0.621371f;
        System.out.println(distKM+" in Miles is "+distMiles);
    }
}
