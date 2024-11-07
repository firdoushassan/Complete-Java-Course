package com.company;

        class MyThr extends Thread{
            public MyThr(String name){
                super(name);
            }
            public void run(){
                int i =0;
                while(i<20){
                    System.out.println("Thread Running");
                    i++;
                }
            }
}

class MyThr2 implements Runnable{
    public MyThr2(){
    }
    public void run(){
        System.out.println("Interface thread running");
    }
}

public class Thread_constructor {
    public static void main(String[] args) {
        MyThr tr = new MyThr("Latest");
        tr.start();
        System.out.println("Id of thread tr is : "+ tr.getId());
        System.out.println("Name of thread tr is : "+ tr.getName());
        MyThr2 tr2= new MyThr2();
        Thread gr2 = new Thread(tr2, "Oldest");
        gr2.start();
        System.out.println("Id of thread tr2 is : "+ gr2.getId());
        System.out.println("Name of thread tr2 is : "+ gr2.getName());
    }
}
