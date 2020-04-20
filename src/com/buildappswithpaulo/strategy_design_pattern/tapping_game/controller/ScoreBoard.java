/* The package contains the controller classes that are useful
    for implementing the model classes.
    This can also be seen as the conceptual or the abstract foundations
    of the models.
    The conceptual underpinnings of the controller package is yet to be
    understood.
*/
package com.buildappswithpaulo.strategy_design_pattern.tapping_game.controller;

/* The class implements the scoreboard object.
   Notice that the class does not inherit form any class or interface.
   However, it contains an object of the interface "ScoreAlgorithmBase" which is a generalization for calling
   class specific implementations of the algorithms.
   In short, composition is preferred over inheritence.
 */
public class ScoreBoard {
    // Note: An instance of an interface is created here.
    // This could be done because it is only declared here, anf not initialized anywhere.
    public com.buildappswithpaulo.strategy_design_pattern.tapping_game.controller.ScoreAlgorithmBase algorithmBase;
    // Again, calling a method does not amount to initialization.
    public void showScore(int taps, int multiplier) {
        System.out.println(algorithmBase.calculateScore(taps,multiplier));
    }
}
