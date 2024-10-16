package com.company;
import java.util.Scanner;

public class else_if {
    public static void main(String[] args){
        int age ;
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        if(age>56){
            System.out.println("Experienced");
        }
        else if(age>46){
            System.out.println("Semi-experienced");
        }
        else if(age>36){
            System.out.println("Semi-semi-experienced");
        }
        else{
            System.out.println("Not experienced");
        }
    }
}
