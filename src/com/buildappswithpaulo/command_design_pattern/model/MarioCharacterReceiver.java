package com.buildappswithpaulo.command_design_pattern.model;

public class MarioCharacterReceiver {
    private String name;
    public void moveUp() {
        System.out.println(name + " is moving up");
    }
    public void moveDown() {
        System.out.println(name + " is`moving down");
    }
    public void moveLeft() {
        System.out.println(name + " is moving left");
    }
    public void moveRight() {
        System.out.println(name + " is moving right");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
