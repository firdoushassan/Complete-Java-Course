package com.company;

public class arrays {
    public static void main(String[] args){
//        int [] marks = new int [5];
//        marks[0]=100;
//        marks[1]=60;
//        marks[2]=70;
//        marks[3]=90;
//        marks[4]=86;
//        System.out.println(marks[4]);
//        float [] marks = {98,45,79,99,80};
        int [] marks = {98,45,79,99,80};
//        System.out.println(marks[0]);
//        for(int i =0;i<marks.length;i++){
//            System.out.println(marks[i]);
//        }
//        System.out.println("In reverse order");
//        for(int i =marks.length-1;i>=0;i--){
//            System.out.println(marks[i]);
//        }
        System.out.println("Using For each loop");
        for(int a:marks){
            System.out.println(a);
        }
    }
}
