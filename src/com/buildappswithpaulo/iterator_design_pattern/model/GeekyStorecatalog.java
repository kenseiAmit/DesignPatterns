package com.buildappswithpaulo.iterator_design_pattern.model;

import com.buildappswithpaulo.iterator_design_pattern.controller.Catalog;
import com.buildappswithpaulo.iterator_design_pattern.controller.GeekyStoreIterator;
import com.buildappswithpaulo.iterator_design_pattern.controller.Iterator;

import java.util.ArrayList;

public class GeekyStorecatalog implements Catalog {
    private ArrayList<Product> products;

    public GeekyStorecatalog() {
        products = new ArrayList<>();

        addItem("Superman Comic!", "The best in town", 12.99);
        addItem("Batman Comic!", "Okay, but still good", 11.99);
        addItem("Jedi T-Shirt", "Gotta have it", 29.99);
    }
    public void addItem(String name, String description, double price) {
        products.add(new Product(name, description, price));
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    @Override
    public GeekyStoreIterator creatIteroter() {
        return new GeekyStoreIterator(products);
    }
}
