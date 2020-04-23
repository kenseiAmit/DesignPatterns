package com.buildappswithpaulo.singleton_design_pattern.controller;

public class EagerSingleton {
    private static EagerSingleton eagerSingleton = new EagerSingleton();
    public String name;
    private EagerSingleton() {
    }
    public static EagerSingleton fetcheagerSingleton() {
        return eagerSingleton;
    }
}
