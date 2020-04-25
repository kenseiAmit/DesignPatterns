package com.buildappswithpaulo.iterator_design_pattern.model;

import com.buildappswithpaulo.iterator_design_pattern.controller.Catalog;
import com.buildappswithpaulo.iterator_design_pattern.controller.DevStoreIterator;

public class DevStoreCatalog implements Catalog {
    private static final int MAX_ITEMS = 4;
    private int numberOfProducts = 0;
    Product[] products;

    @Override
    public DevStoreIterator creatIteroter() {
        return new DevStoreIterator(products);
    }

    public DevStoreCatalog() {
        products = new Product[MAX_ITEMS];
        addItem("C++ is not dead, Yet!", "T-Shirt", 39.99);
        addItem("Java rocks, Yes!", "Silky mousepad", 19.99);
        addItem("Java Design Patterns", "Book - A must", 139.99);
        addItem("Web Development Cookbook", "The best web development cookbook", 29.99);
    }
    public void addItem(String name, String decription, double price) {
        if (numberOfProducts >= MAX_ITEMS)
            System.out.println("Catalog is full! Cannot add more products.");
        else
            products[numberOfProducts++] = new Product(name, decription, price);
    }
}
