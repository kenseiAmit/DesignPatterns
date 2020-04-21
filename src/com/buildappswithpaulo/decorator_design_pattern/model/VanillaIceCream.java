/*
The class takes up any ice cream and imparts vanilla flavour to it
It contains an attribute of IceCream interface by virtue of inheritence
from the class IceCreamDecorator
 */
package com.buildappswithpaulo.decorator_design_pattern.model;

import com.buildappswithpaulo.decorator_design_pattern.controller.IceCream;
import com.buildappswithpaulo.decorator_design_pattern.controller.IceCreamDecorator;

public class VanillaIceCream extends IceCreamDecorator {

    public VanillaIceCream(IceCream iceCream) {
        super(iceCream);
    }

    // This is the method where price is changed
    @Override
    public double cost() {
        System.out.println("Adding vanilla ice cream!");
        return 1.2 + super.cost();
    }
}
