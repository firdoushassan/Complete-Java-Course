package com.me.shapes;


public class Square{
public Square(){
	System.out.println("Using the class Square features");
}
int side;
public int getSide(){
return side;
}
public void setSide(int side){
this.side = side;
}
public int area(){
System.out.print("Area of the square is : ");
return this.side*this.side;
}
public int perimeter(){
System.out.print("Perimeter of the square is : ");
return 4*this.side;
}
	public static void main(String[] args){
	System.out.println("Square class loaded");
	}
}