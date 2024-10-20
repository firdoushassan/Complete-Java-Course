package com.company;

import java.util.Scanner;

public class switch_case {
    public static void main(String[] args){
        int age ;
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        switch(age){
            case 18:
                System.out.println("Going to become an Adult");
                break;
            case 23:
                System.out.println("Going to join a job");
                break;
            case 60:
                System.out.println("Going to get retired");
                break;
            default:
                System.out.println("Enjoy your life");
        }
    }

}
