package com.me.shapes;

public class Square {
    int side;

    public Square() {
        System.out.println("Using the class Square features");
    }

    public int getSide() {
        return this.side;
    }

    public void setSide(int var1) {
        this.side = var1;
    }

    public int area() {
        System.out.print("Area of the square is : ");
        return this.side * this.side;
    }

    public int perimeter() {
        System.out.print("Perimeter of the square is : ");
        return 4 * this.side;
    }

    public static void main(String[] var0) {
        System.out.println("Square class loaded");
    }
}
