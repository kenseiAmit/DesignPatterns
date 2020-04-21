// This is the meat lover burger
package com.buildappswithpaulo.factory_design_pattern.model;

import com.buildappswithpaulo.factory_design_pattern.controller.Hamburger;

public class MeatLover extends Hamburger {
    public MeatLover() {
        name = "Meat Lover Hamburger";
        sauce = "Meat sauce";
        buns = "soft buns";
    }

    @Override
    public void cook() {
        System.out.println("Cooking Meat Lover Burger!");
    }
}
