package com.company;

@FunctionalInterface
interface DemoAno{
    void meth1();
//    void meth2();
}
//class AnonyDemo implements DemoAno {
//    public void display(){
//        System.out.println("Hello");
//    }
//    @Override
//    public void meth1() {
//        System.out.println("I am meth 1");
//    }
//    @Override
//    public void meth2() {
//        System.out.println("I am meth 2");
//    }
//    }
public class Lambda {
    public static void main(String[] args) {
//        AnonyDemo obj = new AnonyDemo();
//        obj.meth1();
//        DemoAno obj = new DemoAno() {
//            @Override
//            public void meth1() {
//                System.out.println("I am meth 1");
//            }
//            @Override
//            public void meth2() {
//                System.out.println("I am meth 2");
//            }
//        };
//        obj.meth1();

        DemoAno obj = ()->{
            System.out.println("I am method 1");
        };
        obj.meth1();
    }
}
