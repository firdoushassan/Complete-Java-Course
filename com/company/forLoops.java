package com.company;
import java.util.Scanner;

public class forLoops {
    public static void main(String[] args) {
//        for(int i =0;i<=10;i++){
//            System.out.print(i);
//        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of time to print odd numbers");
        int odd = sc.nextInt();
        for(int i=0;i<=odd;i++){
            System.out.println(2*i+1);
        }
    } 
}
