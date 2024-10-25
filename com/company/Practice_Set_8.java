package com.company;
import java.util.Scanner;

class EmployeePrc{
    int salary;
    String name;

    int getSalary(){
        return salary;
    }

    String getName(){
        return name;
    }

    String setName(String n){
        name = n;
        return n;
    }

}

class Square{
    int side;
    int area(){
        int a = side*side;
        return a;
    }
    int perimeter(){
        int p = 4*side;
        return p;
    }
}

class Rectangle{
    int length;
    int breadth;
    int area(){
        return length*breadth;
    }
    int perimeter(){
        return 2*(length+breadth);
    }
}

class TommyVercetti{
    void hit(){
        System.out.println("Tommy is Hitting....");
    }
    void run(){
        System.out.println("Tommy is Running....");
    }
    void fire(){
        System.out.println("Tommy is Firing....");
    }
}

class Circle{
    int radius;
    double area(){
        return Math.PI * radius*radius;
    }
    double perimeter(){
        return 2* Math.PI * radius;
    }
}

public class Practice_Set_8 {
    public static void main(String[] args){

        //Problem
//        EmployeePrc OldEmp = new EmployeePrc();
//        OldEmp.salary = 30000;
//        OldEmp.name = "Oldboy";
//        System.out.println("Salary is : " +OldEmp.getSalary());
//        System.out.println("Name is : " +OldEmp.getName());
//        OldEmp.setName("NewBoy");
//        System.out.println("New name is :" +OldEmp.getName());

        //Problem
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter side of square");
//        Square sq = new Square();
//         sq.side = sc.nextInt();
//
//        System.out.println("Area is : " +sq.area());
//        System.out.println("Perimeter is : " +sq.perimeter());

        //Problem
//         Scanner sc = new Scanner(System.in);
//         Rectangle rc = new Rectangle();
//         System.out.println("Enter length of rectangle");
//         rc.breadth = sc.nextInt();
//         System.out.println("Enter length of rectangle");
//         rc.length = sc.nextInt();
//
//        System.out.println("Area is : " +rc.area());
//        System.out.println("Perimeter is : " +rc.perimeter());

        //Problem
//        TommyVercetti player1 = new TommyVercetti();
//        player1.hit();
//        player1.run();
//        player1.fire();

        //Problem
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of circle");
        Circle c = new Circle();
        c.radius = sc.nextInt();
        System.out.printf("Area is : %.2f \n", c.area());
        System.out.printf("Perimeter is : %.2f " , c.perimeter());

    }

}
