package com.company;

class Phone{
    public void greet(){
        System.out.println("Good Morning");
    }
    public void name(){
        System.out.println("Name is Java in Phone");
    }
}
class SmartPhone extends Phone{
    public void Nogreet(){
        System.out.println("Not a good morning");
    }
    public void name(){
        System.out.println("Name is Java in SmartPhone");
    }
}
public class Dynamic_dispatch {
    public static void main(String[] args) {

//        Phone obj = new Phone();
//        obj.name();
//        SmartPhone smr = new SmartPhone();
        Phone obj = new SmartPhone();
        obj.name();
        //obj.Nogreet(); //--> not possible as it is referred as phone

    }
}
