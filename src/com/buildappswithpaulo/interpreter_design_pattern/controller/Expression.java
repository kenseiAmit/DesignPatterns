package com.buildappswithpaulo.interpreter_design_pattern.controller;

import com.buildappswithpaulo.interpreter_design_pattern.model.InterpreterContext;

public interface Expression {
    String interpreter(InterpreterContext interpreterContext);
}
