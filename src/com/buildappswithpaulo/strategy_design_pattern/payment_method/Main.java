/*
This is the code for learning the Strategy Design Pattern.
This design pattern is used to implement different algorithm
in the same method when invoked in different context.
The pattern suggests a method to implement different algorithms
depending on the context for performing the same task.
 */

/*
A shopping application that lets user add products to a shopping cart and make payment
with either a Credit Card or a Paypal.
 */
package com.buildappswithpaulo.strategy_design_pattern.payment_method;

import com.buildappswithpaulo.strategy_design_pattern.payment_method.model.CreditcardAlgorithm;
import com.buildappswithpaulo.strategy_design_pattern.payment_method.model.PaypalAlgorithm;
import com.buildappswithpaulo.strategy_design_pattern.payment_method.model.Prodcut;
import com.buildappswithpaulo.strategy_design_pattern.payment_method.model.ShhoppingCart;

public class Main {
    public static void main(String[] args) {
        // Let's take up a shopping cart.
        ShhoppingCart shoppingcart = new ShhoppingCart();
        // Oh, a nice pair of pants and a cool shirt is sen.
        Prodcut pants = new Prodcut(123, "23");
        Prodcut shirt = new Prodcut(234, "15");
        // Put the shirt and pants in the cart.
        shoppingcart.addProduct(pants);
        shoppingcart.addProduct(shirt);
        // Pay using Paypal.
        shoppingcart.pay(new PaypalAlgorithm("abc", "def"));
        // Pay using Credit Card.
        shoppingcart.pay(new CreditcardAlgorithm("bcd", 0));
    }
}
