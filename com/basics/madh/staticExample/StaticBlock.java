package com.basics.madh.staticExample;

public class StaticBlock {
    static int a = 4;
    static int b;

    //will only runs once when the first object is created.
    static {
        System.out.println("Hi, from static");
        b = a*5;
    }

    public static void main(String[] args) {
        StaticBlock sb = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock obj = new StaticBlock();

        StaticBlock.b += 5;

        System.out.println(StaticBlock.a + " " + StaticBlock.b);
    }
}
