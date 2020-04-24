package com.buildappswithpaulo.interpreter_design_pattern.model;

public class InterpreterContext {

    public String getBinary(int data) {
        return Integer.toBinaryString(data);
    }
    public String getHeadecimal(int data) {
        return Integer.toHexString(data);
    }
}
