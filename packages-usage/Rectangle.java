package com.me.shapes;



public class Rectangle extends Square{
public Rectangle(){
	System.out.println("Using the class Rectangle features");
}
int breadth;
public int getBreadth(){
return breadth;
}
public void setBreadth(int breadth){
this.breadth = breadth;
}
public int area(){
return this.side*this.breadth;
}
public int perimeter(){
return 2*(this.side+this.breadth);
}
	public static void main(String[] args){
		System.out.println("Rectangle Class Loaded");
	}
}
