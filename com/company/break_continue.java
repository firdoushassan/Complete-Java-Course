package com.company;

public class break_continue {
    public static void main(String[] args) {
//        for(int i =0;i<5;i++){
//            System.out.println(i);
//            System.out.println("Java is Great");
//            if(i==2){
//                System.out.println("Ending loop");
//                break;
//            }
//        }

        for(int i =0;i<5;i++){
            if(i==2){
                System.out.println("Ending loop");
                continue;
            }
            System.out.println(i);
            System.out.println("Java is Great");
        }
    }
}
