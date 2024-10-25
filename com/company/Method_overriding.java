package com.company;

class Amethod{
    public int a;
    public int Abc(){
        return 4;
    }
    public void Abc2(){
        System.out.println("method 2 of class A");
    }
}
class Bmethod extends Amethod{
    @Override                   //---> for programmer to know if it is really overriding
    public void Abc2(){
        System.out.println("method 2 of class B");
    }
}
public class Method_overriding {
    public static void main(String[] args) {
        Amethod a = new Amethod();
        a.Abc2();
        Bmethod b = new Bmethod(); //--->overriding method of class A
        b.Abc2();



    }
}
