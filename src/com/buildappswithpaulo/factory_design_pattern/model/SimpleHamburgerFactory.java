/*
This is the simple hamburger factory
 */
package com.buildappswithpaulo.factory_design_pattern.model;

import com.buildappswithpaulo.factory_design_pattern.controller.Hamburger;
import com.buildappswithpaulo.factory_design_pattern.controller.HamburgerStore;

public class SimpleHamburgerFactory extends HamburgerStore {

    @Override
    public Hamburger creatHamburger(String type) {
        // Notice the enhanced switch here
        return switch (type.toLowerCase()) {
            case "cheese" -> new CheeseBurger();
            case "veggie" -> new VeggieBurger();
            case "meat lover" -> new MeatLover();
            case "greek" -> new GreekBurger();
            case "bun less" -> new BunLessBurger();
            default -> null;
        };
    }
}
