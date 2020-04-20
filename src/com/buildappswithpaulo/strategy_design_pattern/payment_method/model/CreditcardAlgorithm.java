package com.buildappswithpaulo.strategy_design_pattern.payment_method.model;

import com.buildappswithpaulo.strategy_design_pattern.payment_method.controller.Payment;
/* The Credit Card algorithm takes the name and the card number to pay
   The algorithm implements the "Payment" interface in the controller package
*/

public class CreditcardAlgorithm implements Payment {
    private String name;
    private int cardNumber;

    public CreditcardAlgorithm(String name, int cardNumber) {
        this.name = name;
        this.cardNumber = cardNumber;
    }
    // They payment method is overridden to implement the Credit Card algorithm
    @Override
    public void pay(int amount) {
        System.out.println(amount + " payed with Credit Card");
    }
}
