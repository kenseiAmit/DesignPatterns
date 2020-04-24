package com.buildappswithpaulo.command_design_pattern.model;

import com.buildappswithpaulo.command_design_pattern.controller.Command;

public class MarioCommandRight implements Command {
    private MarioCharacterReceiver marioCharacterReceiver;

    public MarioCommandRight(MarioCharacterReceiver marioCharacterReceiver) {
        this.marioCharacterReceiver = marioCharacterReceiver;
    }

    @Override
    public void execute() {
        marioCharacterReceiver.moveRight();
    }
}
