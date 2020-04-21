/*
This is a decorator class which will be used to create flavoured
ice creams by decorating simple ones
The class contains an object of the interface IceCream
It is to be kept in mind that the attribute of the interface iceCream
is actually a generalized placeholder for any kind of ice cream
That is to say, any flavoured or unflavoured ice cream can be decorated
using this class
 */
package com.buildappswithpaulo.decorator_design_pattern.controller;

/*
IceCreamDecorator is a class and not an interface
This is a potential source of confusion
An object of tis class can be created

 */
public class IceCreamDecorator implements IceCream {
    // An object of any ice cream type which is decorated by the
    // decorator
    private IceCream iceCream;
    public IceCreamDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    // Change the type of the ice cream
    @Override
    public double cost() {
        return iceCream.cost();
    }
}
