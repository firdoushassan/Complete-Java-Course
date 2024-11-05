package com.company;

abstract class Pen{
    abstract public void write();
    abstract public void refill();
}
class fountainPen extends Pen{
    public void write(){
        System.out.println("Writing with the pen");
    }
    public void refill(){
        System.out.println("Refilling the pen");
    }
    public void changeNib(){
        System.out.println("Changing the nib");
    }
}

class Monkey{
    void jump(){
        System.out.println("Jumping");
    }
    void bite(){
        System.out.println("Biting");
    }
}
interface  BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{
    public void eat(){
        System.out.println("Humans eat");
    }
    public void sleep(){
        System.out.println("Humans sleep");
    }
}

public class Practice_Set_11 {
    public static void main(String[] args) {

        //Problem
//        fountainPen l = new fountainPen();
//        l.refill();
//        l.write();
//        l.changeNib();

        //Problem
//        Human me = new Human();
//        me.eat();
//        me.sleep();
//        Monkey you = new Human();
//        you.jump();
//        you.bite();


    }
}
