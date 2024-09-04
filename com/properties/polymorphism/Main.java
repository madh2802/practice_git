package com.properties.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shape s = new Shape();
        s.area();

        Shape sq = new Square();
        sq.area();

    }
}
