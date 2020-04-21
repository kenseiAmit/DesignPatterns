package com.buildappswithpaulo.factory_design_pattern.model;

import com.buildappswithpaulo.factory_design_pattern.controller.Hamburger;
import com.buildappswithpaulo.factory_design_pattern.controller.HamburgerStore;

public class MozHamburgerStore extends HamburgerStore {
    @Override
    public Hamburger creatHamburger(String type) {
        switch (type.toLowerCase()) {
            case "cheese": return new MozambicanCheeseBurger();
            case "veggie": return new MozambicanVeggieBurger();
            default: return null;
        }
    }
}
