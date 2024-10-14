package com.company;
import java.util.Scanner;

public class CbseBoardPercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Total Marks");
        int totalMarks = sc.nextInt();
        System.out.println("Enter Marks for Subject 1");
        float sub1 = sc.nextFloat();
        System.out.println("Enter Marks for Subject 2");
        float sub2 = sc.nextFloat();
        System.out.println("Enter Marks for Subject 3");
        float sub3 = sc.nextFloat();
        System.out.println("Enter Marks for Subject 4");
        float sub4 = sc.nextFloat();
        System.out.println("Enter Marks for Subject 5");
        float sub5 = sc.nextFloat();
        float percentage = ((sub1+sub2+sub3+sub4+sub5)/totalMarks)*100;
        System.out.print("Total Percentage is : ");
        System.out.println(percentage);

    }
}
