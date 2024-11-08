package com.company;

class MyThr3 extends Thread {
    public MyThr3(String name) {
        super(name);
    }

    public void run() {
        int i = 0;
        while (i < 10) {
            System.out.println("Name of the thread is : " +this.getName());
            i++;
        }
    }
}
public class Thread_priorities {
    public static void main(String[] args) {
        MyThr3 t1 = new MyThr3("One");
        MyThr3 t2 = new MyThr3("Two");
        MyThr3 t3 = new MyThr3("Three - highest priority");
        MyThr3 t4 = new MyThr3("Four");
        MyThr3 t5 = new MyThr3("Five");
        t3.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t5.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
