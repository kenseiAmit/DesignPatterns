package com.buildappswithpaulo.iterator_design_pattern.controller;

import com.buildappswithpaulo.iterator_design_pattern.model.Product;

public class Seller {
    Catalog geekyStoreCatalog;
    Catalog devStoreCatalog;

    public Seller(Catalog geekyStoreCatalog, Catalog devStoreCatalog) {
        this.geekyStoreCatalog = geekyStoreCatalog;
        this.devStoreCatalog = devStoreCatalog;
    }

    public void printCatalog() {
        Iterator geekyStoreIterator = geekyStoreCatalog.creatIteroter();
        System.out.println("Printing the Geeky Catalog...");
        printCatalog(geekyStoreIterator);

        System.out.println("Printing Dev Catalog...");
        Iterator devStoreIterator = devStoreCatalog.creatIteroter();
        printCatalog(devStoreIterator);
    }
    private void printCatalog(Iterator iterator) {
        while (iterator.hasnext()) {
            Product product = (Product) iterator.getNext();
            System.out.println(product.getName() + " ");
            System.out.println(product.getDescription() + " ");
            System.out.println(product.getPrice());
        }
    }
}
