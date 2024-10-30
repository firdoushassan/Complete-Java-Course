package com.company;


class Base1{
    Base1(){
        System.out.println("This is a constructor Base1");
    }
    Base1(int x){
        System.out.println("This is a constructor Base1 with value :" +x);
    }
}
class Derived1 extends Base1{
    Derived1(){
//        super(0);
        System.out.println("This is derived class constructor");
    }
    Derived1(int x, int y){
        super(x);
        System.out.println("This is derived class constructor with values "+y);
    }
}
class ChildDerived extends Derived1{
    ChildDerived(){
        System.out.println("This is a child derived constructor");
    }
    ChildDerived(int x, int y, int z){
        super(x,y);
        System.out.println("This is a child derived constructor with values " +z);
    }
}

public class ConstructorsInInheritance {
    public static void main(String[] args) {
//        Base1 b = new Base1();
//        Derived1 d = new Derived1();
//        Derived1 d = new Derived1(4,9);
    ChildDerived cd = new ChildDerived(10,11,12);

    }
}
