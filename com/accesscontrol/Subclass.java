package com.accesscontrol;

public class Subclass extends A {

    Subclass obj1 = new Subclass(12,"pravin");

    int num = obj1.num;

    Subclass(int num, String name) {
        super(num, name);
    }
}
