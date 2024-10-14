package com.company;
import java.util.Scanner;

public class Practice_Set_2 {
    public static void main(String[] args){
        /*float a = 7/4*9/2;      // will give wrong value
        System.out.println(a);
        float b = 7/4f*9/2f;    // Correct Way
        System.out.println(b);
        */
      /* char grade = 'B';
        // Encrypt
       grade = (char)(grade+8);
        System.out.println(grade);
        //  Decrypt
        grade = (char)(grade-8);
        System.out.println(grade);
        */
       int a1 = 48;
        Scanner newNo = new Scanner(System.in);
        System.out.println("Enter the number to check");
        int b = newNo.nextInt();
        System.out.println(a1<b);
        int v = 2,u=4,a=6,s=1;
        int c = (v*v-u*u)/(2*a*s);
        System.out.println(c);
        int x = 7;
        int a2 = 7*49/7+35/7;
        System.out.println(a2);
    }
}
