package com.properties.inheritance;

public class BoxPrice extends BoxWeight {
    double price;

    BoxPrice(){
        super();
        this.price = 100;
    }

    BoxPrice(BoxPrice other){
        super(other);
        this.price = other.price;
    }

    public BoxPrice(int h, int w, int b, double weight, double price) {
        super(h, w, b, weight);
        this.price = price;
    }
}
