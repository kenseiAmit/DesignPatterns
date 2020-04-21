package com.buildappswithpaulo.observer_design_pattern.controllers;

public interface Subject {
    void register(Observer observer);
    void unregister(Observer observer);
    void notifyObservers();
    Object getUpdate(Observer observer);
}
