/*
This is a Mozambican Hamburger Factory
Only Mozambican hamburgers are served
 */
package com.buildappswithpaulo.factory_design_pattern.model;

import com.buildappswithpaulo.factory_design_pattern.controller.Hamburger;
import com.buildappswithpaulo.factory_design_pattern.controller.HamburgerStore;

public class MozHamburgerStore extends HamburgerStore {
    @Override
    public Hamburger creatHamburger(String type) {
        return switch (type.toLowerCase()) {
            case "cheese" -> new MozambicanCheeseBurger();
            case "veggie" -> new MozambicanVeggieBurger();
            default -> null;
        };
    }
}
