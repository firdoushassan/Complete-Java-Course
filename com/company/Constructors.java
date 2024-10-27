package com.company;

import com.sun.security.jgss.GSSUtil;

class MyempC{
    private int id;private String name;
    public void setId(int i){id = i;}
    public int getId(){return id;}
    public void setName(String n){name = n;}
    public String getName(){return name;}

    public  MyempC(int n, String m){
        id = n;
        name =m;
    }
}

public class Constructors {
    public static void main(String[] args) {
        MyempC Abc = new MyempC(12,"My Employee");
        System.out.println(Abc.getId());
        System.out.println(Abc.getName());

    }
}
