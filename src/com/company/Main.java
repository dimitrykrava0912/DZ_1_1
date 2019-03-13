package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Cat Tom = new Cat("Tom", 15);
        Cat Garfield = new Cat("Garfield", 10);

        System.out.println(Tom.toString());
        Tom.getVoice();
        Tom.move();

        System.out.println(Garfield.toString());
        Garfield.getVoice();
        Garfield.move();
    }
}
