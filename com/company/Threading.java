package com.company;

//class MyThread extends Thread{
//    @Override
//    public void run(){
//        while (true){
//            System.out.println("Thread is running");
//            System.out.println("Happy");
//        }
//    }
//}
//class MyThread2 extends Thread{
//    @Override
//    public void run(){
//        while (true){
//            System.out.println("Thread 2 is running");
//            System.out.println("Sad");
//        }
//    }
//}

class MyThread implements Runnable{
    public void run(){
        System.out.println("Thread running using interface");
    }
}
class MyThread2 implements Runnable{
    public void run(){
        System.out.println("Thread 2 running using interface2222");
    }
}

public class Threading {
    public static void main(String[] args) {
//        MyThread t1 = new MyThread();
//        MyThread2 t2 = new MyThread2();
//        t1.start();
//        t2.start();
        MyThread t1 = new MyThread();
        Thread g1 = new Thread(t1);
        MyThread2 t2 = new MyThread2();
        Thread g2 = new Thread(t2);
        g1.start();
        g2.start();

    }
}
