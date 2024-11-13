package com.company;

class NegException extends Exception{
    @Override
    public String toString() {
        return "Radius cannot be negative";
    }
}

public class Throw_Throws {

    public static double area(int r) throws NegException{
        if(r<0){
            throw new NegException();
        }
        return Math.PI*r*r;
    }

    public static int divide(int a, int b) throws ArithmeticException{
        //Creating function
        int result = a/b;
        return result;
    }
    public static void main(String[] args) {
        //using function
//        try{
//            int c = divide(6, 0);
//            System.out.println(c);
//        }catch(Exception e){
//            System.out.println("Exception");
//        }

//        double r = area(6); ---> error as exception not handled, will not run

        try{
            double r = area(-12);
            System.out.println(r);
        }catch(Exception e){
            System.out.println(e);
        }

    }
}
