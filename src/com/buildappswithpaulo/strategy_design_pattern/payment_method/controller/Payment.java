/* The interface "Payment" is implemented by various kind of payment methods
   The methods in this interface will be overridden by class specific methods
*/
package com.buildappswithpaulo.strategy_design_pattern.payment_method.controller;

public interface Payment {
    // This is the generalized payment method which needs to be overridden
    // by class specific implementations
    void pay(int amount);
}
