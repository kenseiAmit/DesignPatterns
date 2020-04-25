package com.buildappswithpaulo.bridge_design_pattern.model;

import com.buildappswithpaulo.bridge_design_pattern.controller.Workshop;

public abstract class Vehicle {
    protected Workshop workshop, anotherWorkshop;

    public Vehicle(Workshop workshop, Workshop anotherWorkshop) {
        this.workshop = workshop;
        this.anotherWorkshop = anotherWorkshop;
    }
    abstract public void manufacture();
}
