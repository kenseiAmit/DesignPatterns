package com.buildappswithpaulo.factory_design_pattern.model;

import com.buildappswithpaulo.factory_design_pattern.controller.Hamburger;
import com.buildappswithpaulo.factory_design_pattern.controller.HamburgerStore;

public class JamHamburgerStore extends HamburgerStore {

    @Override
    public Hamburger creatHamburger(String type) {
        switch (type.toLowerCase()) {
            case "cheese": return new JamaicanVeggieBurger();
            case "veggie": return  new JamaicanCheeseBurger();
            default: return null;
        }
    }
}
