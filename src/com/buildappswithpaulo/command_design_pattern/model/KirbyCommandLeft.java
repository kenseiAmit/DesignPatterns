package com.buildappswithpaulo.command_design_pattern.model;

import com.buildappswithpaulo.command_design_pattern.controller.Command;

public class KirbyCommandLeft implements Command {
    private KirbyCharacterReceiver kirbyCharacterReceiver;

    public KirbyCommandLeft(KirbyCharacterReceiver kirbyCharacterReceiver) {
        this.kirbyCharacterReceiver = kirbyCharacterReceiver;
    }

    @Override
    public void execute() {
        kirbyCharacterReceiver.moveLeft();
    }
}
