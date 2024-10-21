package com.company;

public class Practice_Set_5 {
    public static void main(String[] args) {

        //Problem
//        int n =4;
//        for(int i =n;i>0;i--){
//            for(int j=0;j<i;j++){
//                System.out.print("*");
//            }
//            System.out.println("\n");
//        }

        //Problem
//        int n = 7;
//        int fact=1;
//        for(int i=1;i<=n;i++){
//            fact = fact*i;
//        }
//        System.out.println(fact);

        //Problem
//        int sum =0;
//        for(int i =1;i<=10;i++){
//            sum = sum + (8*i);
//        }
//        System.out.println(sum);

        //Problem
        int n = 4;
        while (n >= 1) {
            int m = 1;
            while (m <= n) {
                System.out.print("*");
                m++;
            }
            System.out.println(); // Move to the next line
            n--;
        }
    }
}
