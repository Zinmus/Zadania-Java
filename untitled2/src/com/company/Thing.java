package com.company;

public class Thing {
    String name;
    static int price;

    Thing(String name) {
        this.name = name;
    }

    static void changePrice(int newPrice) {
        price = newPrice;
        Person.interest = (int)(Math.random() * 100);
    }
}
