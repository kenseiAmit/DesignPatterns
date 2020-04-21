/*
This is a Jamaican Hamburger Store
Only Jamaican hamburgers are served
 */
package com.buildappswithpaulo.factory_design_pattern.model;

import com.buildappswithpaulo.factory_design_pattern.controller.Hamburger;
import com.buildappswithpaulo.factory_design_pattern.controller.HamburgerStore;

public class JamHamburgerStore extends HamburgerStore {

    @Override
    public Hamburger creatHamburger(String type) {
        // Notice, here switch is nested in the return statement
        return switch (type.toLowerCase()) {
            case "cheese" -> new JamaicanVeggieBurger();
            case "veggie" -> new JamaicanCheeseBurger();
            default -> null;
        };
    }
}
