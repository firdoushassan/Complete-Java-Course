package com.company;

public class Variable_arguments {

    static int var(int ...arr){
        int r = 0;
        for(int a:arr){
            r+=a;
        }
        return r;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to varargs");
        System.out.println("SUm is " +var(2,3,4,5,7));
    }
}
