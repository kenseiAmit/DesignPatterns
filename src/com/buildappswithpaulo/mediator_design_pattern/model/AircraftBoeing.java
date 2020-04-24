package com.buildappswithpaulo.mediator_design_pattern.model;

import com.buildappswithpaulo.mediator_design_pattern.controller.AirCraftMediator;
import com.buildappswithpaulo.mediator_design_pattern.controller.Aircraft;

public class AircraftBoeing extends Aircraft {
    public AircraftBoeing(AirCraftMediator airCraftMediator, String name) {
        super(airCraftMediator, name);
    }

    @Override
    public void sendMeaasge(String message) {
        System.out.println("The aircraft " + super.getName() + " says " + message);
        super.sendToMediator(message);
    }

    @Override
    public void recieveMessage(String message) {
        System.out.println("The aircraft " + super.getName() + " hears " + message);
    }
}
