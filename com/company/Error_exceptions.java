package com.company;


import java.util.Scanner;

public class Error_exceptions {
    public static void main(String[] args) {
//        int a =6000;
//        int b =0;
//                try{
//                    int c = a/b;
//                    System.out.println("Result is : " +c);
//                }catch(Exception e){
//                    System.out.println("Couldnt solve . Reason : " +e);
//                }
        int [] arr = new int[3];
        arr[0] = 7;
        arr[1] = 56;
        arr[2] = 6;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array index to find");
        int array = sc.nextInt();

        System.out.println("Enter no. to divide with");
        int num = sc.nextInt();
        try{
            System.out.println("Value at array index is : "+arr[array]);
            System.out.println("Value after division is :" + arr[array]/num);
        }catch(ArithmeticException e){
            System.out.println("Arithmetic exception occurred");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array out of index exception occurred");
        }catch(Exception e){
            System.out.println("Some other exception occurred");
        }
    }
}
