package com.buildappswithpaulo.memento_design_pattern.model;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    private List<Memento> mementos = new ArrayList<>();

    public Memento getMementos(int index) {
        return mementos.get(index);
    }

    public void setMementos(Memento memento) {
        mementos.add(memento);
    }
}
