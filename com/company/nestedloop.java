package com.company;
import java.util.Scanner;

public class nestedloop {
    public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = sc.nextInt();
        for(int i=1;i<=num;i++){
            System.out.println(i+".INFOSYS");
            if(i%10==0){
                System.out.println("Moniruddin Middey");
            }
        }
    }
}
