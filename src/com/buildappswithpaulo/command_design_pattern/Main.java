package com.buildappswithpaulo.command_design_pattern;

import com.buildappswithpaulo.command_design_pattern.model.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Gameboy!");
        MarioCharacterReceiver mario = new MarioCharacterReceiver();
        mario.setName("Mario");
        KirbyCharacterReceiver kirby = new KirbyCharacterReceiver();
        kirby.setName("Kirby");

        MarioCommandDown marioCommandDown = new MarioCommandDown(mario);
        MarioCommandLeft marioCommandLeft = new MarioCommandLeft(mario);
        MarioCommandRight marioCommandRight = new MarioCommandRight(mario);
        MarioCommandUp marioCommandUp = new MarioCommandUp(mario);

        KirbyCommandDown kirbyCommandDown = new KirbyCommandDown(kirby);
        KirbyCommandLeft kirbyCommandLeft = new KirbyCommandLeft(kirby);
        KirbyCommandRight kirbyCommandRight = new KirbyCommandRight(kirby);
        KirbyCommandUp kirbyCommandUp = new KirbyCommandUp(kirby);

        GameBoy gameBoyMario = new GameBoy(marioCommandUp, marioCommandDown, marioCommandLeft, marioCommandRight);
        GameBoy gameBoyKirby = new GameBoy(kirbyCommandUp, kirbyCommandDown, kirbyCommandLeft, kirbyCommandRight);

        gameBoyMario.arrowDown();
        gameBoyKirby.arrowLeft();
    }
}
