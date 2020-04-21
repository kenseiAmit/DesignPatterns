package com.buildappswithpaulo.factory_design_pattern.controller;

public abstract class Hamburger {
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
