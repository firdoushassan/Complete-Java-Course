package com.company;
import java.util.Scanner;

class InvalidInputException extends Exception{
    @Override
    public String toString() {
        return "You enter an invalid operation input";
    }
}
class zeroArithmeticException extends Exception{
    @Override
    public String toString() {
        return "You cannot divide a number by zero";
    }
}
class maxNumberLimitException extends Exception{
    @Override
    public String toString() {
        return "Enter number less than 100000";
    }
}
class maxMultiplierException extends Exception{
    public String toString(){
        return "Value of the number for multiplication should be less than 7000";
    }
}

public class Calculator {
    public static void main(String[] args) {
        String operation = "/";
        float num1 = 1,num2 =1 ;
        System.out.println("Welcome to Calculator");
        System.out.println("There are four operations you can perform:\n They are : +, -, *, and /");
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while(flag){
            try{
                System.out.println("Enter num1");
                num1 = sc.nextFloat();
                if(num1>=100000){
                    throw new maxNumberLimitException();
                }
                flag = false;
            }catch (maxNumberLimitException z){
                System.out.println(z);
            }
        }
        flag = true;
        while(flag){
            try{
                System.out.print("Enter operation to perform : ");
                operation = sc.next();
                if(!operation.equals("+") && !operation.equals("-") && !operation.equals("*") && !operation.equals("/")){
                    throw new InvalidInputException();
                }
                flag= false;
            }catch(InvalidInputException e){
                System.out.println(e);
            }
        }
        flag = true;
        while(flag){
            try{
                System.out.println("Enter num2");
                num2 = sc.nextFloat();
                if(operation.equals("/") && num2 == 0){
                    throw new zeroArithmeticException();
                }
                if(num2>=100000){
                    throw new maxNumberLimitException();
                }
                flag = false;
            }catch(zeroArithmeticException | maxNumberLimitException z){
                System.out.println(z);
            }
        }
        float result;
        if(operation.equals("+")){
            result = num1+num2;
            System.out.println("The result of "+num1+" + "+num2+" is : " +result);
        }
        if(operation.equals("-")){
            result = num1-num2;
            System.out.println("The result of "+num1+" - "+num2+" is : " +result);
        }
        if(operation.equals("*")){
            result = num1*num2;
            System.out.println("The result of "+num1+" * "+num2+" is : " +result);
        }
        if(operation.equals("/")){
            result = num1/num2;
            System.out.println("The result of "+num1+" / "+num2+" is : " +result);
        }

    }
}
