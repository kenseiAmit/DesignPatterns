// This is the simple bunless burger
package com.buildappswithpaulo.factory_design_pattern.model;

import com.buildappswithpaulo.factory_design_pattern.controller.Hamburger;

public class BunLessBurger extends Hamburger {

    public BunLessBurger() {
        name = "Bun less burger";
        sauce = "sauces";
        buns = "fluffy buns";
    }

    @Override
    public void cook() {
        System.out.println("Cooking bun less burger....");
    }
}
