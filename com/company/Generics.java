package com.company;

import java.util.ArrayList;

class MyGeneric<T1>{
    int val;
    private T1 t1;
    public MyGeneric(int val, T1 t1) {
        this.val = val;
        this.t1 = t1;
    }
    public int getVal() {
        return val;
    }
    public void setVal(int val) {
        this.val = val;
    }
    public T1 getT1() {
        return t1;
    }
    public void setT1(T1 t1) {
        this.t1 = t1;
    }
}

public class Generics {
    public static void main(String[] args) {
//        ArrayList arrayList = new ArrayList();
//        arrayList.add("str1");
//        arrayList.add(54);
//        arrayList.add(643);
//        int a = (int)arrayList.get(2);
//        System.out.println(a);
//        ArrayList<Integer> arr = new ArrayList();
//        arr.add(23);
//        arr.add(34);int b = arr.get(1);
//        System.out.println(b);

        MyGeneric<String> g1 = new MyGeneric<>(23, "MyString");
        String a = g1.getT1();
        int b = g1.getVal();
        System.out.println(a);



    }
}
