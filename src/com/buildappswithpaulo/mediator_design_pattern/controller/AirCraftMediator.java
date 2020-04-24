package com.buildappswithpaulo.mediator_design_pattern.controller;

import java.util.List;

public interface AirCraftMediator {
    void sendMessage(String message, Aircraft aircraft);
    void addAircraft(Aircraft aircraft);
}
