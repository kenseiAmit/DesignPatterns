/*
The class takes up any ice cream and imparts mint flavour to it
It contains an attribute of IceCream interface by virtue of inheritence
from the class IceCreamDecorator
 */

package com.buildappswithpaulo.decorator_design_pattern.model;

import com.buildappswithpaulo.decorator_design_pattern.controller.IceCream;
import com.buildappswithpaulo.decorator_design_pattern.controller.IceCreamDecorator;

public class MintIceCream extends IceCreamDecorator {

    public MintIceCream(IceCream iceCream) {
        super(iceCream);
    }

    // This is the method where price is changed
    @Override
    public double cost() {
        System.out.println("Adding mint ice cream!");
        return 1.5 + super.cost();
    }
}
