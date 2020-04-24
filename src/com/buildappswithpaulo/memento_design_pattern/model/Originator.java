package com.buildappswithpaulo.memento_design_pattern.model;

public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento getMemento() {
        return new Memento(state);
    }
    public void setMemento(Memento memento) {
        state = memento.getState();
    }
}
