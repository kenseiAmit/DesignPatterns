/*
The project is a hamburger stores model which contains multiple hamburger
stores, which serve various types of hamburgers
These hamburgers are created through factory creation design pattern
 */

package com.buildappswithpaulo.factory_design_pattern;

import com.buildappswithpaulo.factory_design_pattern.controller.Hamburger;
import com.buildappswithpaulo.factory_design_pattern.controller.HamburgerStore;
import com.buildappswithpaulo.factory_design_pattern.model.JamHamburgerStore;
import com.buildappswithpaulo.factory_design_pattern.model.MozHamburgerStore;
import com.buildappswithpaulo.factory_design_pattern.model.SimpleHamburgerFactory;

public class Main {
    public static void main(String[] args) {
        Hamburger hamburger;

        HamburgerStore simpleHamburgerStore = new SimpleHamburgerFactory();
        HamburgerStore mozHamburgerStore = new MozHamburgerStore();
        HamburgerStore jamHamburgerStore = new JamHamburgerStore();

        hamburger = simpleHamburgerStore.orderHamburger("cheese");
        System.out.println("Paulo ordered: " + hamburger.getName());
        hamburger = mozHamburgerStore.orderHamburger("cheese");
        System.out.println("Paulo ordered: " + hamburger.getName());
        hamburger = jamHamburgerStore.orderHamburger("veggie");
        System.out.println("Paulo ordered: " + hamburger.getName());
    }
}
