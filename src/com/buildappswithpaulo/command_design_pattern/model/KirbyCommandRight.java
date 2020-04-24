package com.buildappswithpaulo.command_design_pattern.model;

import com.buildappswithpaulo.command_design_pattern.controller.Command;

public class KirbyCommandRight implements Command {
    private KirbyCharacterReceiver kirbyCharacterReceiver;

    public KirbyCommandRight(KirbyCharacterReceiver kirbyCharacterReceiver) {
        this.kirbyCharacterReceiver = kirbyCharacterReceiver;
    }

    @Override
    public void execute() {
        kirbyCharacterReceiver.moveRight();
    }
}
