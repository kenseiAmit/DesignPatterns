package com.buildappswithpaulo.command_design_pattern.model;

import com.buildappswithpaulo.command_design_pattern.controller.Command;

public class KirbyCommandDown implements Command {
    private KirbyCharacterReceiver kirbyCharacterReceiver;

    public KirbyCommandDown(KirbyCharacterReceiver kirbyCharacterReceiver) {
        this.kirbyCharacterReceiver = kirbyCharacterReceiver;
    }

    @Override
    public void execute() {
        kirbyCharacterReceiver.moveDown();
    }
}
