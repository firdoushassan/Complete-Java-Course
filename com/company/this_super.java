package com.company;

class Eclass{
    int a;
    public int getA() {
        return a;
    }
    Eclass(int a){
        this.a=a;
    }
    public int returnOne(){
        return 1;
    }

}
public class this_super {
    public static void main(String[] args) {
        Eclass e = new Eclass(55);
        System.out.println(e.getA());

    }
}
