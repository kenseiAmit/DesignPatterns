/*
This is the generic hamburger store which must be inherited by all kinds
of hamburger stores
All hamburger stores must have a method to order hamburgers
This method is the hook to implement creation of various kinds of hamburgers
 */
package com.buildappswithpaulo.factory_design_pattern.controller;

public abstract class HamburgerStore {
    // The method to order hamburgers
    public Hamburger orderHamburger(String type) {
        Hamburger hamburger;

        // This is where the creation of various type of hamburgers is
        // hooked into the class
        hamburger = creatHamburger(type);

        hamburger.prepare();
        hamburger.cook();
        hamburger.box();

        return hamburger;
    }
    // This is thw method that creates various kind of hamburgers
    // depending on the context
    abstract public Hamburger creatHamburger(String  type);
}
