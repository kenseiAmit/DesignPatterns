/*
This is the code for learning the Strategy Design Pattern.
This design pattern is used to implement different algorithm
in the same method when invoked in different context.
The pattern suggests a method to implement different algorithms
depending on the context for performing the same task.
 */

/*
Think of a benin game in which three types of objects --- balloons,
clown,and square balloons --- appear on screen. The user ears points
for tapping the objects on screen. Of'course the points earned
for tapping on different types of objects is different.
At the end, the score of the user is calculated by a method
that implements the Strategy Design Pattern.
 */


package com.buildappswithpaulo.strategy_design_pattern.tapping_game;

import com.buildappswithpaulo.strategy_design_pattern.tapping_game.model.Balloon;
import com.buildappswithpaulo.strategy_design_pattern.tapping_game.model.Clowns;
import com.buildappswithpaulo.strategy_design_pattern.tapping_game.model.SquareBalloons;
import com.buildappswithpaulo.strategy_design_pattern.tapping_game.controller.ScoreBoard;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to strategy Design Patterns!");
        ScoreBoard scoreBoard = new ScoreBoard();
        scoreBoard.algorithmBase = new Balloon();
        System.out.println("Points scored from balloons: " + scoreBoard.algorithmBase.calculateScore(5, 10));
        scoreBoard.algorithmBase = new Clowns();
        System.out.println("Points scored from clowns: " + scoreBoard.algorithmBase.calculateScore(6, 3));
        scoreBoard.algorithmBase = new SquareBalloons();
        System.out.println("Points scored from square balloons: " + scoreBoard.algorithmBase.calculateScore(2, 8));
    }
}
