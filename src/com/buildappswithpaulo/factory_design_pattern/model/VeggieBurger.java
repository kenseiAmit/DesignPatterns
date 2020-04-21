// This is a veggie burger
package com.buildappswithpaulo.factory_design_pattern.model;

import com.buildappswithpaulo.factory_design_pattern.controller.Hamburger;

public class VeggieBurger extends Hamburger {
    public VeggieBurger() {
        name = "Veggie Burger";
        sauce = "Vegetable sauce";
        buns = "rotten buns";
    }

    @Override
    public void cook() {
        System.out.println("Cooking simple veggie burger ...");
    }
}
