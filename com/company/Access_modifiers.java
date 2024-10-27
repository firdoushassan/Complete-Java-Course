package com.company;
import java.util.Scanner;

class Myemp{
    private int id;
    private String name;

    public void setId(int i){
        id = i;
    }
    public int getId(){
        return id;
    }
    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
}


public class Access_modifiers {
    public static void main(String[] args) {

        Myemp Abc = new Myemp();
//        Abc.id = 12;
//        Abc.name = "My Employee";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Id");
        int id = sc.nextInt();
        Abc.setId(id);
        Abc.setName("My Employee");
        System.out.println(Abc.getId());
        System.out.println(Abc.getName());


    }
}
