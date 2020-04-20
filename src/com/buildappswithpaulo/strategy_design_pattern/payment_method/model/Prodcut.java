/*
The product is identified by its upc code, and has a price to it
 */
package com.buildappswithpaulo.strategy_design_pattern.payment_method.model;

public class Prodcut {
    private int price;
    private String upcCode;

    public Prodcut(int price, String upcCode) {
        this.price = price;
        this.upcCode = upcCode;
    }

    public int getPrice() {
        return price;
    }

    public String getUpcCode() {
        return upcCode;
    }
}
