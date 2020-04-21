/*
This is the abstract hamburger class which represents all hamburgers
All hamburgers, whether a simple or a flavoured burger, must inherit form
this class
 */
package com.buildappswithpaulo.factory_design_pattern.controller;

public abstract class Hamburger {
    // All burgers must have a name, and contain sauce and buns
    public String name;
    public String sauce;
    public String buns;

    public void prepare() {
        System.out.println("Preparing ......");
    }
    public void cook() {
        System.out.println("Cooking .....");
    }
    public void box() {
        System.out.println("Packing .....");
    }
    public String getName() {
        return name;
    }
}
