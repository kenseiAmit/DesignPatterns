package com.buildappswithpaulo.mediator_design_pattern.model;

import com.buildappswithpaulo.mediator_design_pattern.controller.AirCraftMediator;
import com.buildappswithpaulo.mediator_design_pattern.controller.Aircraft;

import java.util.ArrayList;
import java.util.List;

public class MediatorAircraft implements AirCraftMediator {
    List<Aircraft> aircrafts;

    public MediatorAircraft() {
        aircrafts = new ArrayList<>();
    }

    @Override
    public void sendMessage(String message, Aircraft aircraft) {
        for (Aircraft aircrafT: aircrafts)
            if (aircrafT != aircraft)
                aircrafT.recieveMessage(message);
    }

    @Override
    public void addAircraft(Aircraft aircraft) {
        if (!aircrafts.contains(aircraft))
            aircrafts.add(aircraft);
    }
}
