package com.buildappswithpaulo.iterator_design_pattern.controller;

import com.buildappswithpaulo.iterator_design_pattern.controller.Iterator;
import com.buildappswithpaulo.iterator_design_pattern.model.Product;

import java.util.ArrayList;
import java.util.List;

public class GeekyStoreIterator implements Iterator {
    private ArrayList<Product> products;
    private int position = 0;

    public GeekyStoreIterator(ArrayList<Product> products) {
        this.products = products;
    }

    @Override
    public boolean hasnext() {
        if (position >= products.size() || products.get(position) == null)
            return false;
        else
            return true;
    }

    @Override
    public Object getNext() {
        return products.get(position++);
    }
}
