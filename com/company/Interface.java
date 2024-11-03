package com.company;

interface Bicycle{
    void applyBrake(int decrement);
    void speedUp(int increment);
}
class AvonCycle implements Bicycle{
    public void applyBrake(int decrement){
        System.out.println("Applying Brake");
    }
    public void speedUp(int increment){
        System.out.println("Speeding Up");
    }
}

public class Interface {
    public static void main(String[] args) {
        AvonCycle me = new AvonCycle();
        me.applyBrake(1);
    }
}
