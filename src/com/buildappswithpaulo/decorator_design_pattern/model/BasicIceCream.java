/*
This the basic, plain, simple ice cream.
 */
package com.buildappswithpaulo.decorator_design_pattern.model;

import com.buildappswithpaulo.decorator_design_pattern.controller.IceCream;


public class BasicIceCream implements IceCream {
    public BasicIceCream() {
        System.out.println("Creating a basic ice cream");
    }

    // This the price of a plain ice cream
    @Override
    public double cost() {
        return 0.5;
    }
}
