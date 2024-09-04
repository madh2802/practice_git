package com.basics.madh.staticExample;

public class Main {
    public static void main(String[] args) {
        Human kunal = new Human(20,"kunal",10000);
        Human saket = new Human(29, "saket", 20000);
        Human keshav = new Human(30, "keshav", 70000);

        System.out.println(kunal.age);
        System.out.println(Human.population);
        System.out.println(saket.name);
        System.out.println(keshav.salary);

    }

    Main obj = new Main();

    static void fun(){

    }

    void greetings(){
        fun();
    }

    
}
