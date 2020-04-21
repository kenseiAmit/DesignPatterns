package com.buildappswithpaulo.factory_design_pattern.model;

import com.buildappswithpaulo.factory_design_pattern.controller.Hamburger;

public class MozambicanCheeseBurger extends Hamburger {

    public MozambicanCheeseBurger() {
        name = "Mozambican Style Cheese Burger";
        sauce = "Spicy Mozambican sauce";
        buns = "Cookie dough buns";
    }

    @Override
    public void cook() {
        System.out.println("Cooking MozambicanCheeseBurger ....");
    }
}
