package com.company;
import java.util.Scanner;

public class Practice_Set_7 {

    static void multiplication(int n){
        for(int i = 1;i<=10;i++){
            System.out.print(n+" X "+i+" = "+n*i);
            System.out.println("");
        }
    }

    static void pattern1(int n){
        for(int i=1;i<=n;i++){
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    static int sum(int n){
        if (n==1){
            return 1;
        }
        else{
            return n+ sum(n-1);
        }
    }

    static void pattern2(int n){
        for(int i=n;i>=1;i--){
            for(int j=i; j>=1;j--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    static int fibRec(int n){
        if(n==1 || n==2){
            return n-1;
        }
        else{
            return fibRec(n-1) + fibRec(n-2);
        }
    }

    static int avg(int ...arr){
        int c = 0;
        for(int a:arr){
            c+=a;
        }
        return c/arr.length;
    }

    static void pattern2rec(int n){
        if(n>0){
            for(int i=n; i>=1;i--){
                System.out.print("*");
            }
            System.out.println("");
            pattern2rec(n-1);

        }
    }

    static float cTof(float n){
        float f = (n*9/5)+32;
        return f;
    }

    static int sumIT(int n){
        int sum=0;
        for(int i =1;i<=n;i++){

            sum+=i;
        }
        return sum;
    }

    public static void main(String[] args) {

        //Problem
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number to find multiplication table ");
//        int num = sc.nextInt();
//        multiplication(num);

        //Problem
//        pattern1(4);

        //Problem
//        System.out.println(sum(2));

        //Problem
//        pattern2(4);

        //Problem
//        Fibonacci series : 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233
//        System.out.println(fibRec(4));

        //Problem
//        System.out.println(avg(10,20,30));

        //Problem
//        pattern2rec(4);

        //Problem
//        System.out.println(cTof(-40));

        //Problem
        System.out.println(sumIT(5));


    }

}
