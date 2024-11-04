package com.company;

interface Camera2{
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
interface Wifi2{
    String[] getNetWorks();
    void connectToNetwork(String network);
}

class Mycellphone2{
    void callNumber(int phoneNumber){
        System.out.println("Calling" +phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }
}
class MySmartPhone2 extends Mycellphone2 implements Wifi2, Camera2{
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

public class Polymorphism {
    public static void main(String[] args) {
        Camera2 cam1 = new MySmartPhone2();
//        cam1.getNetworks(); --->not allowed
        cam1.record4KVideo(); //---can only use Camera interface methods only.
    }
}
