package com.buildappswithpaulo.interpreter_design_pattern.model;

import com.buildappswithpaulo.interpreter_design_pattern.controller.Expression;

public class IntToHexadecimalExpression implements Expression {
    int data;

    public IntToHexadecimalExpression(int data) {
        this.data = data;
    }

    @Override
    public String interpreter(InterpreterContext interpreterContext) {
        return interpreterContext.getHeadecimal(data);
    }
}
