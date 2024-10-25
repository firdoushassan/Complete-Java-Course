package com.company;

public class Method_overloading {
    static int change(int [] arr){
        arr[0]= 45;
        return arr[0];
    }

    static void foo(){
        System.out.println("Good Morning");
    }

    static void foo(int a){
        System.out.println("Good Morning " + a);
    }

    static void foo(int a, int b){
        System.out.println(b+ " Good Morning " + a);
    }


    public static void main(String[] args) {
//        int [] marks = {52,73,77,89,98,94};
//        change(marks);
//        System.out.println(marks[0]);

        foo();
        foo(100);
        foo(200,100);

    }
}
