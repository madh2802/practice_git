package com.basics.madh.staticExample;



public class InnerClass {

    static class Name {
        static String name;

        public Name(String name){
            Name.name = name;
        }
    }

    public static void main(String[] args) {
        Name n = new Name("Ashish");
        Name n1 = new Name("Mahesh");

        System.out.println(n.name);
        System.out.println(n1.name);
    }
}
