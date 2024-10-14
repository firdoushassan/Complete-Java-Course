package com.company;
import java.util.Scanner;

public class InputTake {
    public static void main(String[] args) {
        System.out.println("Taking Input from the User");
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number 1");
//        int a = sc.nextInt();
//        System.out.println("Enter number 2");
//        int b = sc.nextInt();
//        int sum = a+b;
//        System.out.print("The sum of the two numbers is : ");
//        System.out.println(sum);
          String s = sc.next(); //----> To read a single word
          System.out.println(s);
          String s2 = sc.nextLine(); // ----> To read a whole sentence
          System.out.println(s2);

    }
}
