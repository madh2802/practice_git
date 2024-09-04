package com.properties.inheritance;

public class Main {
    public static void main(String[] args) {
        Box b = new Box();

//        System.out.println(b.h + " " + b.w + " " + b.b);
//
//        Box b1 = new Box(b);
//
//        System.out.println(b.h + " " + b.w + " " + b.b);

        BoxWeight bw = new BoxWeight(2,3,4,9);

        Box b2 = new BoxWeight(2,4,5,6);
        //ref variable b2 is of type box, hence it cannot access the weight property of the childe
//        System.out.println(b2.weight);


        //weight needs the weight variable as it of type BoxWeight but we have created
        //an object of type Box, which does not contain the weight property
        //hence weight cannot points towards the object of type Box.

//        BoxWeight weight = new Box(2,3,4);

        Box bx = new Box(bw);

        System.out.println(bx.h);

        BoxPrice p = new BoxPrice();

        System.out.println(p.h);
        System.out.println(p.b);
        System.out.println(p.w);
        System.out.println(p.boxWeight);
        System.out.println(p.price);


        Box b3 = new Box();

        b3.greetings();

        BoxWeight b4 = new BoxWeight();
        b4.greetings();

    }


}
