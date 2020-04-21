package com.buildappswithpaulo.factory_design_pattern.controller;

public abstract class HamburgerStore {
    public Hamburger orderHamburger(String type) {
        Hamburger hamburger;

        hamburger = creatHamburger(type);

        hamburger.prepare();
        hamburger.cook();
        hamburger.box();

        return hamburger;
    }
    abstract public Hamburger creatHamburger(String  type);
}
