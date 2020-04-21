package com.buildappswithpaulo.factory_design_pattern.model;

import com.buildappswithpaulo.factory_design_pattern.controller.Hamburger;

public class CheeseBurger extends Hamburger {

    public CheeseBurger() {
        name = "Cheese Burger";
        sauce = "cheese sauce";
        buns = "simple buns";
    }

    @Override
    public void cook() {
        System.out.println("Cooking cheese burger .....");
    }
}
