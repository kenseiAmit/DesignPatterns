// This is a greek burger
package com.buildappswithpaulo.factory_design_pattern.model;

import com.buildappswithpaulo.factory_design_pattern.controller.Hamburger;

public class GreekBurger extends Hamburger {
    public GreekBurger() {
        name = "Greek burger";
        sauce = "Greek classic sauce";
        buns = "nice buns";
    }

    @Override
    public void cook() {
        System.out.println("Cooking Greek burger.....");
    }
}
