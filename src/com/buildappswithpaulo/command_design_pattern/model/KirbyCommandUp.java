package com.buildappswithpaulo.command_design_pattern.model;

import com.buildappswithpaulo.command_design_pattern.controller.Command;

public class KirbyCommandUp implements Command {
    private KirbyCharacterReceiver kirbyCharacterReceiver;

    public KirbyCommandUp(KirbyCharacterReceiver kirbyCharacterReceiver) {
        this.kirbyCharacterReceiver = kirbyCharacterReceiver;
    }

    @Override
    public void execute() {
        kirbyCharacterReceiver.moveUp();
    }
}
