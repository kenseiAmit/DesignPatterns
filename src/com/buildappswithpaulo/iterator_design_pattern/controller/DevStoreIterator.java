package com.buildappswithpaulo.iterator_design_pattern.controller;

import com.buildappswithpaulo.iterator_design_pattern.controller.Iterator;
import com.buildappswithpaulo.iterator_design_pattern.model.Product;

public class DevStoreIterator implements Iterator {
    private Product[] products;
    int positon = 0;

    public DevStoreIterator(Product[] products) {
        this.products = products;
    }

    @Override
    public boolean hasnext() {
        return positon > 0 && positon < products.length;
    }

    @Override
    public Object getNext() {
        return products[positon++];
    }

    public void remove() {
        if (positon <= 0)
            throw new IllegalStateException("Cannot remove item until the pointer is on 0");
        else if (products[positon-1] == null) {
            for (int index = positon - 1; index < products.length - 1; index++)
                products[index] = products[index + 1];
            products[products.length - 1] = null;
        }
    }
}
