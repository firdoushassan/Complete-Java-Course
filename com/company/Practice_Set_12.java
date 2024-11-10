package com.company;

class Mrng extends Thread{
    public Mrng(String name) {
        super(name);
    }
    public void run(){
        int i =0;
        while (i<25){
//            try {
//                Thread.sleep(20);
//            }catch(Exception e){
//                System.out.println(e);
//            }
            System.out.println("Good Morning");
            i++;
        }
    }
}
class Mrng2 extends Thread{
    public Mrng2(String name) {
        super(name);
    }
    public void run(){
        int i =0;
        while (i<25){
//            try {
//                Thread.sleep(20);
//            }catch(Exception e){
//                System.out.println(e);
//            }
            System.out.println("Welcome");
            i++;
        }
    }
}
public class Practice_Set_12 {
    public static void main(String[] args) {

        //Problem
//        Mrng mr = new Mrng();
//        Mrng2 mr2 = new Mrng2();
//        mr.start();
//        mr2.start();

        //Problem
//        Mrng mr = new Mrng();
//        Mrng2 mr2 = new Mrng2();
//        mr.start();
//        mr2.start();

        //Problem
        Mrng mr = new Mrng("GoodMorning");
        Mrng2 mr2 = new Mrng2("Welcome");
        System.out.println("State of Good Morning : " +mr.getState());
        mr.start();
        System.out.println("State of Good Morning : " +mr.getState());
        mr.setPriority(Thread.MAX_PRIORITY);
        mr2.start();
        mr2.setPriority(Thread.MIN_PRIORITY);
        System.out.println("Priority of Good Morning : " +mr.getPriority());
        System.out.println("Priority of Welcome : " +mr2.getPriority());
        System.out.println("State of Good Morning : " +mr.getState());
        System.out.println("State of Welcome : " +mr2.getState());
        System.out.println("Name of Current thread : " +Thread.currentThread().getName());
        System.out.println("State of Current thread : " +Thread.currentThread().getState());

    }
}
