package com.company;

import java.util.Scanner;

public class nested_try_catch {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 7;
        arr[1] = 56;
        arr[2] = 6;
        boolean flag = true;
        while (flag) {
            System.out.println("Enter index");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            try {
                System.out.println("Welcome 1");
                try {
                    System.out.println(arr[a]);
                    flag = false;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Array index does not exist");
                }
            } catch (Exception e) {
                System.out.println("Exception in level 1");
            }
        }
    }
}
