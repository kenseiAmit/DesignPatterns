package com.buildappswithpaulo.factory_design_pattern.model;

import com.buildappswithpaulo.factory_design_pattern.controller.Hamburger;

public class MozambicanVeggieBurger extends Hamburger {
    public MozambicanVeggieBurger() {
        name = "Mozambican Hmaburger";
        sauce = "Mozambican sauce";
        buns = "simple salty buns";
    }

    @Override
    public void cook() {
        System.out.println("Cooking Mozambican Veggie Burger ...");
    }
}
