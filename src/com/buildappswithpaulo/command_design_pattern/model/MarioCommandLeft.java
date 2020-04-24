package com.buildappswithpaulo.command_design_pattern.model;

import com.buildappswithpaulo.command_design_pattern.controller.Command;

public class MarioCommandLeft implements Command {
    private MarioCharacterReceiver marioCharacterReceiver;

    public MarioCommandLeft(MarioCharacterReceiver marioCharacterReceiver) {
        this.marioCharacterReceiver = marioCharacterReceiver;
    }

    @Override
    public void execute() {
        marioCharacterReceiver.moveLeft();
    }
}
