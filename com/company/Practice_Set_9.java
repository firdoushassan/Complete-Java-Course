package com.company;

class Cylinder{

    private int radius,height;

     int getRadius() {
        return radius;
    }

     void setRadius(int radius) {
        this.radius = radius;
    }

     int getHeight() {
        return height;
    }

     void setHeight(int height) {
        this.height = height;
    }
    public double area(){
         return 2*Math.PI*radius*height + 2*Math.PI*radius*radius;
    }

    public double volume(){
        return Math.PI*radius*radius*height;
    }

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }
}

class Rect {
    private int length, breadth;
    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }

    public Rect() {
        this.length = 4;
        this.breadth = 5;
    }

    public Rect(int length, int breadth) {
        this.length=length;
        this.breadth=breadth;
    }
}

public class Practice_Set_9 {
    public static void main(String[] args) {

        //Problem
//        Cylinder c = new Cylinder();
//        c.setRadius(4);
//        c.setHeight(6);
//        System.out.println(c.getHeight());
//        System.out.println(c.getRadius());
//        System.out.println(c.area());
//        System.out.println(c.volume());

        //Problem
        Cylinder c = new Cylinder(4,6);

        //Problem
        Rect r = new Rect();
        System.out.println(r.getLength());
        System.out.println(r.getBreadth());

        Rect p = new Rect(6,9);
        System.out.println(p.getLength());
        System.out.println(p.getBreadth());
    }
}
