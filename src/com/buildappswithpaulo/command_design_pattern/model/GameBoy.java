package com.buildappswithpaulo.command_design_pattern.model;

import com.buildappswithpaulo.command_design_pattern.controller.Command;


public class GameBoy {
    Command upCommand, downCommand, leftCommand, rightCommand;

    public GameBoy(Command upCommand, Command downCommand, Command leftCommand, Command rightCOmmand) {
        this.upCommand = upCommand;
        this.downCommand = downCommand;
        this.leftCommand = leftCommand;
        this.rightCommand = rightCOmmand;
    }

    public void arrowup() {
        upCommand.execute();
    }

    public void arrowDown() {
        downCommand.execute();
    }

    public void arrowLeft() {
        leftCommand.execute();
    }

    public void arrowRight() {
        rightCommand.execute();
    }
}
