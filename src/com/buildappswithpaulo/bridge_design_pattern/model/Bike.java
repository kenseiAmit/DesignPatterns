package com.buildappswithpaulo.bridge_design_pattern.model;

import com.buildappswithpaulo.bridge_design_pattern.controller.Workshop;

public class Bike extends Vehicle {
    public Bike(Workshop workshop, Workshop anotherWorkshop) {
        super(workshop, anotherWorkshop);
    }

    @Override
    public void manufacture() {
        System.out.println("making bike...");
        workshop.make();
        anotherWorkshop.make();
    }
}
