package com.company;

public class Main {

    public static void main(String[] args) {
        Thing.price = 1500;

        Thing thing = new Thing("laptop");

        Person person = new Person("Jan", "Kowalski", 25, 1000);

	    person.Eat();
	    person.Sleep();
	    person.Buy(thing);

	    Thing.changePrice(700);

        person.Buy(thing);

	    System.out.println(person.name + " " + person.surname + " have " + person.money + "$ left.");
    }
}
