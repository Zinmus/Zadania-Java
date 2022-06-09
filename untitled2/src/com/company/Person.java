package com.company;

public class Person {
    String name;
    String surname;
    int age;
    int money;
    static int interest;
    ;

    void Eat() {
        System.out.println(name + " " + surname + " is eating.");
        interest = (int)(Math.random() * 100);

    }

    void Sleep() {
        System.out.println(name + " " + surname + " is sleeping.");
        interest = (int)(Math.random() * 100);

    }

    void Buy(Thing thing) {
        if(money >= Thing.price && interest > 50) {
            System.out.println(name + " " + surname + " bought a " + thing.name + ".");
            money -= Thing.price;
            interest = (int)(Math.random() * 100);
        }
        else if(interest <= 50) {
            System.out.println(name + " " + surname + " don`t want to buy a " + thing.name + ".");
            interest = (int)(Math.random() * 100);
        }
        else{
            System.out.println(name + " " + surname + " don`t have enough money to buy a " + thing.name + ".");
            interest = (int)(Math.random() * 100);
        }
    }

    Person(String name, String surname, int age, int money) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.money = money;
        interest = (int)(Math.random() * 100);
    }
}
