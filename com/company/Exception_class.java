package com.company;


import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString() {
        return "I am toString()";
    }

    @Override
    public String getMessage() {
        return "I am getMessage()";
    }
}
public class Exception_class {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter Integer ");
        int a = sc.nextInt();
        if(a<99){
            try{
                throw new MyException();
            }catch(Exception e){
                System.out.println(e.getMessage());
//                System.out.println(e.toString());
                System.out.println(e);
            }
        }
    }
}
