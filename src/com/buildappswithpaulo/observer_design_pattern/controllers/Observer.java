package com.buildappswithpaulo.observer_design_pattern.controllers;

public interface Observer {
    void setSubject(Subject subject);
    void update();
}
