package com.company;
import java.util.Scanner;

public class Practice_Set_4 {
    public static void main(String[] args) {
        //Problem
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter marks for Subject 1");
//        float sub1 = sc.nextFloat();
//        System.out.println("Enter marks for Subject 2");
//        float sub2 = sc.nextFloat();
//        System.out.println("Enter marks for Subject 3");
//        float sub3 = sc.nextFloat();
//        float sum = (sub1+sub2+sub3)/3;
//        System.out.println("Total percentage is : "+sum);
//        if(sum>=40){
//            if(sub1 >=33 && sub2 >=33 && sub3 >=33){
//                System.out.println("Congratulations!You have passed");
//            }else{
//                System.out.println("You have failed in one or more subjects");
//            }
//        }else{
//            System.out.println("You have failed");
//        }


        //Problem
//        float tax = 0;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Income(In Lakhs)");
//        float income = sc.nextFloat();
//        if(income < 2.5f){
//            tax = tax + 0;
//        }
//        else if(income>2.5f && income <=5f){
//            tax = tax + 0.05f *(income -2.5f);
//        }
//        else if(income>5f && income <=10f){
//            tax = tax + 0.05f *(5.0f -2.5f);
//            tax = tax + 0.2f *(income -5f);
//        }else{
//            tax = tax + 0.05f *(5.0f -2.5f);
//            tax = tax + 0.2f *(10.0f -5f);
//            tax = tax + 0.3f *(income - 10f);
//        }
//        System.out.println("Total tax to be paid(In Lakhs) : " +tax);


        //Problem
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter day number");
//        int day = sc.nextInt();
//        switch(day){
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("sunday");
//            default -> System.out.println("Enter correct day number");
//        }
        //Problem
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter year");
//        int year = sc.nextInt();
//        if(year%4 ==0 && year%10!=0 || year%400 == 0){
//            System.out.println("Leap year");
//        }
//        else{
//            System.out.println("Not a leap year");
//        }
        //Problem
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter website");
        String website = sc.nextLine();
        if(website.endsWith(".com")){
            System.out.println(("Commercial Website"));
        }
        else if(website.endsWith(".org")){
            System.out.println(("Organisational Website"));
        }
        else if(website.endsWith(".in")){
            System.out.println(("Indian Website"));
        }
        else{
            System.out.println("Cannot detect website type");
        }
    }
}
