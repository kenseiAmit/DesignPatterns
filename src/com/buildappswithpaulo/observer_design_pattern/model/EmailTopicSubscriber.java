package com.buildappswithpaulo.observer_design_pattern.model;

import com.buildappswithpaulo.observer_design_pattern.controllers.Observer;
import com.buildappswithpaulo.observer_design_pattern.controllers.Subject;

import java.util.List;

public class EmailTopicSubscriber implements Observer {
    private List<Subject> subjects;
    private String name;

    public EmailTopicSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void setSubject(Subject subject) {
        if (!subjects.contains(subject))
            subjects.add(subject);
    }

    @Override
    public void update() {
        for (Subject subject: subjects) {
            String message = (String)subject.getUpdate(this);
            if (message == null)
                System.out.println(subject.getClass().getName() + ": No new message");
            else
                System.out.println(subject.getClass().getName() + ": " + message);
        }
    }
}
