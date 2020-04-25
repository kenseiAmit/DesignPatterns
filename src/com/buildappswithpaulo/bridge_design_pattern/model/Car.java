package com.buildappswithpaulo.bridge_design_pattern.model;

import com.buildappswithpaulo.bridge_design_pattern.controller.Workshop;

public class Car extends Vehicle {
    public Car(Workshop workshop, Workshop anotherWorkshop) {
        super(workshop, anotherWorkshop);
    }

    @Override
    public void manufacture() {
        System.out.println("making car...");
        workshop.make();
        anotherWorkshop.make();
    }
}

