package com.accesscontrol;

public class A {
    protected int num;
    String name;
    int[] arr;

    A(int num, String name){
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }

    public int getNum(){
        return num;
    }
}
