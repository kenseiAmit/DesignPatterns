package com.buildappswithpaulo.strategy_design_pattern.tapping_game.model;

import com.buildappswithpaulo.strategy_design_pattern.tapping_game.controller.ScoreAlgorithmBase;

/* The package contains the model classes that are used
    for creating the model based on the controller classes.
    This can also be seen as the implementation of the conceptual or abstract foundations
    laid in the controller.
    The conceptual underpinnings of the model package is yet to be
    understood.
*/

public class SquareBalloons implements ScoreAlgorithmBase {
    // The method "calculateScore" is overridden to provide a class specific implementation.
    @Override
    public int calculateScore(int taps, int multiplier) {
        return (taps * multiplier - 10);
    }
}
