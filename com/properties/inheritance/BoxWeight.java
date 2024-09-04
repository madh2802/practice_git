package com.properties.inheritance;

public class BoxWeight extends Box {
    double boxWeight;

    public BoxWeight(){
        this.boxWeight = -1;
    }

    public BoxWeight(int h, int w, int b, double weight){
        super(h,w,b);
        this.boxWeight = weight;
    }

    public BoxWeight(BoxWeight weight){
        super(weight);
        this.boxWeight = weight.boxWeight;
    }

//    static void greetings(){
//        System.out.println("Hi, from boxweight class!");
//    }

}
