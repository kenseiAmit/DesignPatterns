package com.buildappswithpaulo.iterator_design_pattern;

import com.buildappswithpaulo.iterator_design_pattern.controller.Catalog;
import com.buildappswithpaulo.iterator_design_pattern.controller.Seller;
import com.buildappswithpaulo.iterator_design_pattern.model.DevStoreCatalog;
import com.buildappswithpaulo.iterator_design_pattern.model.GeekyStorecatalog;

import javax.print.DocFlavor;

public class Main {
    public static void main(String[] args) {
        Catalog devStoreCatalog = new DevStoreCatalog();
        Catalog geekStoreCatalog = new GeekyStorecatalog();

        Seller seller = new Seller(geekStoreCatalog, devStoreCatalog);
        seller.printCatalog();
    }
}
