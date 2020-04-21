// This is a Jamaican cheese burger
package com.buildappswithpaulo.factory_design_pattern.model;


import com.buildappswithpaulo.factory_design_pattern.controller.Hamburger;

public class JamaicanCheeseBurger extends Hamburger {

    public JamaicanCheeseBurger() {
        name = "Jamaican Style Cheese Burger";
        sauce = "Spicy Jmaican sauce";
        buns = "Cookie dough bun";
    }

    @Override
    public void cook() {
        System.out.println("Cooking Jamaican Style ......");
    }
}
