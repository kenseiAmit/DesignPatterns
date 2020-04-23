package com.buildappswithpaulo.singleton_design_pattern.controller;

import java.util.Objects;

public class LazySingleton {
    private static LazySingleton lazySingleton;
    public String name;
    private LazySingleton() {
    }
    public static synchronized LazySingleton fetchLazySingleton () {
        return Objects.requireNonNullElseGet(lazySingleton, () -> (lazySingleton = new LazySingleton()));
    }
}
