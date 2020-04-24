package com.buildappswithpaulo.command_design_pattern.model;

import com.buildappswithpaulo.command_design_pattern.controller.Command;

public class MarioCommandDown implements Command {
    private MarioCharacterReceiver marioCharacterReceiver;

    public MarioCommandDown(MarioCharacterReceiver marioCharacterReceiver) {
        this.marioCharacterReceiver = marioCharacterReceiver;
    }

    @Override
    public void execute() {
        marioCharacterReceiver.moveDown();
    }
}
