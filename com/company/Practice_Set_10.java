package com.company;

import java.sql.SQLOutput;

class CircleP{
    public int radius;
    CircleP(int r){
        System.out.println("Circle constructor");
        this.radius = r;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class CylinderP extends CircleP{
    public int height;
    CylinderP(int r,int h){
        super(r);
        System.out.println("Cylinder constructor");
        this.height=h;
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }

}

class RectP{
    int length;
    int breadth;
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public int getBreadth() {
        return breadth;
    }
    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
    RectP(){
        System.out.println("Rectangle");
    }
    public int area(){
        return this.length*this.breadth;
    }
}
class CuboidP extends RectP{
    int height;
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    CuboidP(){
        System.out.println("Cuboid");
    }
    public int volume(){
        return this.length*this.breadth*this.height;
    }
}
public class Practice_Set_10 {
    public static void main(String[] args) {

        //Problem
//        CircleP c = new CircleP(5);
//        CylinderP cl = new CylinderP(5, 6);
//        System.out.println(cl.volume());

        //Problem
        RectP r = new RectP();
        CuboidP p = new CuboidP();
        p.setLength(5);
        p.setBreadth(6);
        p.setHeight(10);
        System.out.println(p.volume());

    }

}
