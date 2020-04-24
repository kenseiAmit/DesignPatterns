package com.buildappswithpaulo.interpreter_design_pattern;

import com.buildappswithpaulo.interpreter_design_pattern.model.IntToBinaryExpression;
import com.buildappswithpaulo.interpreter_design_pattern.model.IntToHexadecimalExpression;
import com.buildappswithpaulo.interpreter_design_pattern.model.InterpreterContext;

public class Main {
    public static void main(String[] args) {
        int data = 45;
        IntToBinaryExpression intToBinaryExpression = new IntToBinaryExpression(data);
        IntToHexadecimalExpression intToHexadecimalExpression = new IntToHexadecimalExpression(data);
        InterpreterContext interpreterContext = new InterpreterContext();

        System.out.println(intToBinaryExpression.interpreter(interpreterContext));
        System.out.println(intToHexadecimalExpression.interpreter(interpreterContext));
    }
}
