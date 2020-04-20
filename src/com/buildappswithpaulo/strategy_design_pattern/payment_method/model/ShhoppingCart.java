/* The shopping cart can hold products to be bought
   It also invokes the class specific pay method
*/

package com.buildappswithpaulo.strategy_design_pattern.payment_method.model;

import com.buildappswithpaulo.strategy_design_pattern.payment_method.controller.Payment;

import java.util.ArrayList;
import java.util.List;

public class ShhoppingCart {
    // The list of products to be added to the shopping cart
    List<Prodcut> productList;

    public ShhoppingCart() {
        productList = new ArrayList<>(5);
    }
    // The method to add a product
    public void addProduct(Prodcut product) {
        productList.add(product);
    }
    // The method to remove a product
    public void removeProduct(Prodcut prodcut)  {
        productList.remove(prodcut);
    }
    // Calculate the amount to be paid
    private int calculateTotal() {
        int amount = 0;
        for (Prodcut prodcut: productList)
            amount += prodcut.getPrice();
        return amount;
    }
    // Invoke the payment algorithm agnostic pay method
    public void pay(Payment payment) {
        int amount = calculateTotal();
        // Implement the class specific payment method
         payment.pay(amount);
    }
}
