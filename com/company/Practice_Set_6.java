package com.company;
import java.util.Scanner;

public class Practice_Set_6 {
    public static void main(String[] args) {

        //Problem
//        float sum = 0;
//        float [] array= {10.5f,20f,30f,40.5f,50f};
//        for(int i =0; i<array.length;i++){
//            sum += array[i];
//        }
//        System.out.println(sum);

        //Problem
//        Scanner sc = new Scanner(System.in);
//        int[] number = {10,20,30,40,50};
//        System.out.println("Enter no. to find");
//        int a = sc.nextInt();
//        int b =0;
//        for(int find:number){
//            if(a==find){
//                b=1;
//            }
//        }
//        if(b==1){
//            System.out.println("The No. is present");
//        }
//        else{
//            System.out.println("The no. is not present");
//        }

        //Problem
//        float sum = 0;
//        float [] array= {10.5f,20f,30f,40.5f,50f};
//        for(int i =0; i<array.length;i++){
//            sum += array[i];
//        }
//        System.out.println(sum/array.length);

        //Problem
//        int [][] matrix1 = {{1,2,3}, {4,5,6}};
//        int [][] matrix2 = {{2,6,13}, {3,7,1}};
//        int [][] result = {{0,0,0}, {0,0,0}};
//        for(int i =0;i<matrix1.length;i++){
//            for(int j = 0; j<matrix1[i].length;j++){
//                result[i][j]= matrix1[i][j]+matrix2[i][j];
//                System.out.print(result[i][j] + " ");
//            }
//            System.out.println("");
//        }

        //Problem
//        int[]arr = {1,21,3,4,5,6,34,67};
//        int n = arr.length/2;
//        System.out.print("Original array : ");
//        for(int element:arr){
//            System.out.print(element + " ");
//        }
//        for(int i =0; i<n;i++){
//            int temp = arr[i];
//            arr[i] = arr[arr.length - 1 - i];
//            arr[arr.length - 1 - i] = temp;
//        }
//        System.out.println("");
//        System.out.print("Reversed array : ");
//        for(int element:arr){
//            System.out.print(element + " ");
//        }

        //Problem
//        int[]arr = {1,21,3,4,5,6,34};
//        int max = Integer.MIN_VALUE;
//        for(int a:arr){
//            if(max<a){
//                max = a;
//            }
//        }
//        System.out.println(max);

        //Problem
//        int[]arr = {-14,21,3,4,5,6,34};
//        int min;
//        min = Integer.MAX_VALUE;
//        for(int a:arr){
//            if(min>a){
//                min = a;
//            }
//        }
//        System.out.println(min);

        //Problem
        boolean sorted = true;
        int[]arr = {-14,3,4,21,5,6,34};
        for(int i =0; i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                sorted = false;
                break;
            }
        }
        if(sorted){
            System.out.println("Sorted");
        }
        else{
            System.out.println("Not sorted");
        }
    }
    }
