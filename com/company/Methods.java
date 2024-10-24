package com.company;

public class Methods {
 static int logic(int x, int y){
        int z;
        if (x>y){
            z = x+y;
        }
        else{
            z = (x+y)*5;
        }
        return z;
    }

    public static void main(String[] agrs){
        int a = 5;
        int b = 7;
        int c = logic(a,b);
//        Methods obj = new Methods(); --> For not writing static in method above
//        int c = obj.logic(a,b);   ---> object creation


//        if (a>b){
//            c = a+b;
//        }
//        else{
//            c = (a+b)*5;
//        }'
        System.out.println(c);

    }
}
