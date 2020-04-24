package com.buildappswithpaulo.mediator_design_pattern;

import com.buildappswithpaulo.mediator_design_pattern.model.AircraftBoeing;
import com.buildappswithpaulo.mediator_design_pattern.model.MediatorAircraft;

public class Main {
    public static void main(String[] args) {
        MediatorAircraft mediatorAircraft = new MediatorAircraft();
        AircraftBoeing boeing1 = new AircraftBoeing(mediatorAircraft,"Boeing 1");
        AircraftBoeing boeing787 = new AircraftBoeing(mediatorAircraft, "Boein 787");
        AircraftBoeing boeing2 = new AircraftBoeing(mediatorAircraft, "Boeing 2");
        AircraftBoeing xyx = new AircraftBoeing(mediatorAircraft, "name");

        mediatorAircraft.addAircraft(boeing1);
        mediatorAircraft.addAircraft(boeing2);
        boeing787.sendMeaasge("Hello, Wolrd!");
    }

}
