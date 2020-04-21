package com.buildappswithpaulo.factory_design_pattern.model;


import com.buildappswithpaulo.factory_design_pattern.controller.Hamburger;

public class JamaicanVeggieBurger extends Hamburger {

    public JamaicanVeggieBurger() {
        name = "Jamaican Style Veggie Burger";
        sauce = "Spicy jamaican sauce";
        buns = "Lettuce wrap!";
    }

    @Override
    public void cook() {
        System.out.println("Cooking Jamaican style....");
    }
}