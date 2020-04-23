package com.buildappswithpaulo.singleton_design_pattern.controller;

public class SimpleSingleton {
    public String name;
    public static SimpleSingleton fetchSingleton() {
        return new SimpleSingleton();
    }
    private SimpleSingleton() {
    }
}
