package com.buildappswithpaulo.observer_design_pattern.model;

import com.buildappswithpaulo.observer_design_pattern.controllers.Observer;
import com.buildappswithpaulo.observer_design_pattern.controllers.Subject;

import java.util.List;

public class EmailTopic implements Subject {
    private String message;
    private List<Observer> observers;

    public EmailTopic(List<Observer> observers) {
        this.observers = observers;
    }

    public EmailTopic() {

    }

    @Override
    public void register(Observer observer) {
        if (observer == null)
            throw new NullPointerException("Null object/observer");
        else if (!observers.contains(observer))
            observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        if (observer == null)
            throw new NullPointerException("Null object/observer");
        else observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: observers)
            observer.update();
    }

    @Override
    public Object getUpdate(Observer observer) {
        return this.message;
    }

    public void postMessage(String message) {
        this.message = message;
        System.out.println("Message posted to the topic: " + message);
        notifyObservers();
    }
}
