package com.buildappswithpaulo.interpreter_design_pattern.model;

import com.buildappswithpaulo.interpreter_design_pattern.controller.Expression;

public class IntToBinaryExpression implements Expression {
    int data;

    public IntToBinaryExpression(int data) {
        this.data = data;
    }

    @Override
    public String interpreter(InterpreterContext interpreterContext) {
        return interpreterContext.getBinary(data);
    }
}
