package com.company;

public class Finally_block {
    public static int greet(){
        try{
            int a =5;
            int b=2;
            int c = a/b;
            return c;
        }catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("End of function");
        }
        return -1;
    }
    public static void main(String[] args) {
        int k = greet();
        System.out.println(k);

    }
}
