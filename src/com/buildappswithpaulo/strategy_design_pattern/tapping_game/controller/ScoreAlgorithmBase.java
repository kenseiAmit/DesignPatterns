/* The package contains the controller classes that are useful
    for implementing the model classes.
    This can also be seen as the conceptual or the abstract foundations
    of the models.
    The conceptual underpinnings of the controller package is yet to be
    understood.
*/

package com.buildappswithpaulo.strategy_design_pattern.tapping_game.controller;

/* The interface "ScoreAlgorithmBase" contains the methods that must be
    implemented by all methods that are used to implement the algorithms for
    calculating the score based on the number of taps and the value of a tap.
*/

public interface ScoreAlgorithmBase {
    // The calculation of score requires executing the following methods.
    // The methods definitions are left to be specified by concrete classes that extend the interface.
    int calculateScore(int taps, int multiplier);
}
