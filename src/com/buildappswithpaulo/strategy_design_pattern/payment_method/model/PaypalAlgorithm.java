/*
The Paypal class extends the "Payment" interface and implements the
Paypal payment algorithm.
 */
package com.buildappswithpaulo.strategy_design_pattern.payment_method.model;

import com.buildappswithpaulo.strategy_design_pattern.payment_method.controller.Payment;

public class PaypalAlgorithm implements Payment {
    private String emal;
    private String password;

    public PaypalAlgorithm(String emal, String password) {
        this.emal = emal;
        this.password = password;
    }
    // The method "pay" is overridden to implement Paypal specific algorithm
    @Override
    public void pay(int amount) {
        System.out.println(amount + " payed with paypal");
    }
}
