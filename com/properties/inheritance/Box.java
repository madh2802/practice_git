package com.properties.inheritance;

public class Box {

    int h;
    int w;
    int b;

    Box(){
        this.h = -1;
        this.w = -1;
        this.b = -1;
    }

    Box(int h, int w, int b){
        this.h = h;
        this.w = w;
        this.b = b;
    }

    Box (Box old){
        this.h = old.h;
        this.w = old.w;
        this.b = old.b;
    }

    static void greetings(){
        System.out.println("Hi from box class!");
    }
}
