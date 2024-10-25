package com.company;

 class Employee{
    int id;
    String name;
    int salary;
      void details(){
        System.out.println("Id is :" +id);
        System.out.println("Name is :" +name);
//        System.out.println("Salary is :" +salary);
    }
    int getSalary(){
          return salary;
    }
}

public class OOps {
    public static void main(String[] args) {
        Employee Abc = new Employee();
        Abc.id = 1001;
        Abc.name = "Abc";
        Abc.salary = 22000;
        Employee Abc2 = new Employee();
        Abc2.id = 2001;
        Abc2.name = "Abc2";
        Abc2.salary = 27000;
        Abc.details();
        System.out.println("Salary is " +Abc.getSalary());
        Abc2.details();
        System.out.println("Salary is " +Abc2.getSalary());

//        System.out.println(Abc.id);
//        System.out.println(Abc.name);
    }
}
