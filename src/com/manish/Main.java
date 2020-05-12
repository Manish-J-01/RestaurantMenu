package com.manish;

public class Main {

    public static void main(String[] args) {
	    Hamburger hamburger = new Hamburger("Basic","Ham",3.99, "White");
	   double price = hamburger.itamizedHamburger();
	    hamburger.addHamburgerAddition1("lettuce", 0.27);
	    hamburger.addHamburgerAddition2("tomato", 0.55);
	    hamburger.addHamburgerAddition3("carrot", 0.75);
	   // price = hamburger.itamizedHamburger();
	System.out.println("Total cost of the Hamburger :"
			+ hamburger.itamizedHamburger());
	HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.97);
	healthyBurger.itamizedHamburger();
	healthyBurger.addHealthyAddition1("Egg", 4.57);
	healthyBurger.addHealthyAddition2("Sausage", 3.99);
		System.out.println("Healthy Burger price is: " + healthyBurger.itamizedHamburger());

		DeluxeHamburger deluxeHamburger = new DeluxeHamburger();
		deluxeHamburger.addHamburgerAddition3("Fixed price", 29.99);
		deluxeHamburger.itamizedHamburger();
		//System.out.println("Deluxe Hamburger price: " + deluxeHamburger.itamizedHamburger());
    }
}
