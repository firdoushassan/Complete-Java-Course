package com.company;

import java.util.Scanner;

class MaxTriesException extends Exception{
    @Override
    public String toString() {
        return "Max Tries Reached i.e. 5";
    }
}

public class Practice_Set_13 {
    public static void main(String[] args) {
        //Problem
//        int a =5 ---> Syntax error, no semicolon
//        int age = 43;
//        int year_born = 2000-48; ---> Logical error
//        System.out.println(7/0); --- Runtime error, divided by zero

        //Problem
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        try{
//            int c = 21/a;
//            System.out.println(c);
//        }catch(IllegalArgumentException e){
//            System.out.println("HeHe");
//        }catch (ArithmeticException e){
//            System.out.println("HaHa");
//        }

        //Problem
//        int [] arr = {2,3,4,5,6,7};
//        Scanner sc = new Scanner(System.in);
//        boolean flag = true;
//        int count = 0;
//        while(flag){
//            System.out.print("Enter index: ");
//            int index = sc.nextInt();
//            try{
//                System.out.println("Value at index given is : " +arr[index]);
//                flag = false;
//            }catch(ArrayIndexOutOfBoundsException e){
//                System.out.println(e);
//                count ++;
//                if(count >=5 ){
//                    System.out.println("Error..Multiple tries");
//                    break;
//                }
//            }
//        }

        //Problem
        int [] arr = {2,3,4,5,6,7};
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int count = 0;
        while(flag){
            System.out.print("Enter index: ");
            int index = sc.nextInt();
            try{
                System.out.println("Value at index given is : " +arr[index]);
                flag = false;
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);
                count ++;
                if(count >=5 ){
                    try {
                        throw new MaxTriesException();
                    }catch(MaxTriesException m){
                        System.out.println(m);
                        break;
                    }
                }
            }
        }

    }
}
