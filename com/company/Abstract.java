package com.company;

abstract class Parent{
    public Parent(){
        System.out.println("Base Constuction");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}
class Child extends Parent{
    @Override
    public void greet(){
        System.out.println("Good Morning");
    }
    @Override
    public void greet2(){
        System.out.println("Afternoon");
    }
}
public class Abstract {
    public static void main(String[] args) {

    }
}
