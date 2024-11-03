package com.company;


interface Camera{
    void takeSnap();
    void recordVideo();
    default void record4KVideo(){
        greet();
        System.out.println("Recording in 4K");
    }
    private void greet(){
        System.out.println("Good Morning");
    }
}
interface Wifi{
    String[] getNetWorks();
    void connectToNetwork(String network);
}

class Mycellphone{
    void callNumber(int phoneNumber){
        System.out.println("Calling" +phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }
}
class MySmartPhone extends Mycellphone implements Wifi, Camera{
    public void takeSnap(){
        System.out.println("Taking Snap");
    }
    public void recordVideo(){
        System.out.println("Recording Video");
    }
    public String[] getNetWorks(){
        System.out.println("Getting List of Netwroks...");
        String[] networkList = {"Airtel 5g", "Jio 5g", "Vi5g"};
        return networkList;
    }
    public void connectToNetwork(String network) {
        System.out.println("Connecting to ..."+network);
    }
}
public class Default_methods {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
        String[] arr = ms.getNetWorks();
        for(String a:arr){
            System.out.println(a);
        }
        ms.record4KVideo();
//        ms.greet(); --> throws an error as greet() has private access
    }
}
