package com.buildappswithpaulo.factory_design_pattern.model;

import com.buildappswithpaulo.factory_design_pattern.controller.Hamburger;
import com.buildappswithpaulo.factory_design_pattern.controller.HamburgerStore;

public class SimpleHamburgerFactory extends HamburgerStore {

    @Override
    public Hamburger creatHamburger(String type) {
        switch (type.toLowerCase()) {
            case "cheese": return new CheeseBurger();
            case "veggie": return new VeggieBurger();
            case "meat lover": return new MeatLover();
            case "greek": return new GreekBurger();
            case "bun less": return new BunLessBurger();
            default: return null;
        }
    }
}
