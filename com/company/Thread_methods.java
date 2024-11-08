package com.company;

class Thrm extends Thread{
    public void run(){
        int i =0;
        while(i<200){
            System.out.println("Thrm running");
            i++;
        }
    }
}
class Thrm2 extends Thread{
    public void run(){
        int i =0;
        while(i<200){
            System.out.println("Thrm2 is running 222");
            i++;
        }
    }
}
public class Thread_methods {
    public static void main(String[] args) {
        Thrm t1 = new Thrm();
        Thrm2 t2 = new Thrm2();
        t1.start();
//        try{
//            t1.join();
//        }
//        catch(Exception e){
//            System.out.println(e);
//        }
        t2.start();
    }
}
