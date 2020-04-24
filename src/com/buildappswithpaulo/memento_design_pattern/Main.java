package com.buildappswithpaulo.memento_design_pattern;

import com.buildappswithpaulo.memento_design_pattern.model.CareTaker;
import com.buildappswithpaulo.memento_design_pattern.model.Memento;
import com.buildappswithpaulo.memento_design_pattern.model.Originator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Memento Desing Pattern!");
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("senile");
        System.out.println("The state of the originator is: " + originator.getState());
        Memento memento = originator.getMemento();
        careTaker.setMementos(memento);
        originator.setState("adolescent");
        System.out.println("The state of the originator is: " + originator.getState());
        memento = originator.getMemento();
        careTaker.setMementos(memento);
        originator.setState("infant");
        System.out.println("The state of the originator is: " + originator.getState());
        memento = originator.getMemento();
        careTaker.setMementos(memento);
        originator.setState("adult");
        System.out.println("The state of the originator is: " + originator.getState());
        memento = originator.getMemento();
        careTaker.setMementos(memento);
        originator.setState("");
        System.out.println("The state of the originator is: " + originator.getState());
        memento = originator.getMemento();
        careTaker.setMementos(memento);
        memento = careTaker.getMementos(2);
        originator.setMemento(memento);
        System.out.println("The state of the originator is: " + originator.getState());
    }
}
