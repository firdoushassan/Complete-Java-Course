package com.me.shapes;

public class Rectangle extends Square {
    int breadth;

    public Rectangle() {
        System.out.println("Using the class Rectangle features");
    }

    public int getBreadth() {
        return this.breadth;
    }

    public void setBreadth(int var1) {
        this.breadth = var1;
    }

    public int area() {
        return this.side * this.breadth;
    }

    public int perimeter() {
        return 2 * (this.side + this.breadth);
    }

    public static void main(String[] var0) {
        System.out.println("Rectangle Class Loaded");
    }
}
