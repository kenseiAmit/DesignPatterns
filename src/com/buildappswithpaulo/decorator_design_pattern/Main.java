/*
The project emulates an ice cream shop that sells plain and
flavoured ice creams
The flavouring mechanism is a decorator design pattern that
wraps the plain ice cream in a flavour.
 */

// The package for the Decorator Design Pattern
package com.buildappswithpaulo.decorator_design_pattern;
// The Ice cream interface that ensures that an ice cream has a price
import com.buildappswithpaulo.decorator_design_pattern.controller.IceCream;
// The decorator class that wraps a plain ice cream in a flavour
import com.buildappswithpaulo.decorator_design_pattern.controller.IceCreamDecorator;
// The plain ice cream class
import com.buildappswithpaulo.decorator_design_pattern.model.BasicIceCream;
// The vanilla flavour wrapper
import com.buildappswithpaulo.decorator_design_pattern.model.VanillaIceCream;

public class Main {
    public static void main(String[] args) {
        // The plain ice cream
        IceCream iceCream = new BasicIceCream();
        System.out.println(iceCream.cost());
        System.out.println("basic ice cream cost $: " + iceCream.cost());
        IceCream vanillaIceCream = new VanillaIceCream(iceCream);
        System.out.println("vanilla ice cream cost $: " + iceCream.cost());

        IceCream iceCreamDecorator = new IceCreamDecorator(iceCream);
        System.out.println(iceCreamDecorator.cost());
    }
}
