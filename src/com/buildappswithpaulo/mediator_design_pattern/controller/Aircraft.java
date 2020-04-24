package com.buildappswithpaulo.mediator_design_pattern.controller;

import java.util.List;

public abstract class Aircraft {
    private AirCraftMediator airCraftMediator;
    private String name;

    public Aircraft(AirCraftMediator airCraftMediator, String name) {
        this.airCraftMediator = airCraftMediator;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void sendToMediator(String message) {
        airCraftMediator.sendMessage(message, this);
    }

    abstract public void sendMeaasge(String message);
    abstract public void recieveMessage(String message);
}
