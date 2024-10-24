package com.company;
import java.util.Scanner;

public class Recursion {
    static int fact(int n){
      if(n==0 || n==1){
          return 1;
      }
      else{
          return n* fact(n-1);
      }
    }

    static int fib(int n) {
        System.out.print("The fibonacci series for the first "+n+" numbers is : ");
        int a = 0, b=1, c=0;
        if (n == 1) {
            System.out.print(a);
        } else if (n>1){
            System.out.print(a + ", ");
            System.out.print(b + ", ");
            for(int i =2; i<n;i++){
                c = a+b;
                a=b;
                b=c;
                System.out.print(c + ", ");
            }
        }
        return 0;
    }
    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter no.");
//        int n = sc.nextInt();
//        System.out.println("The value of factorial is " + fact(n));

        //Fibonacci series
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.");
        int n = sc.nextInt();
        fib(n);

    }

}
