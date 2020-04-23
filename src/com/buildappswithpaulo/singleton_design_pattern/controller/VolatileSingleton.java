package com.buildappswithpaulo.singleton_design_pattern.controller;

import java.util.Objects;

public class VolatileSingleton {
    private static VolatileSingleton volatileSingleton;
    public String name;
    private VolatileSingleton() {
    }
    public static VolatileSingleton fetchVolatileSingleton() {
        if (volatileSingleton == null)
            synchronized (VolatileSingleton.class) {
                if (volatileSingleton == null)
                    return  Objects.requireNonNullElseGet(volatileSingleton, ()-> (volatileSingleton = new VolatileSingleton()));
                else
                    return volatileSingleton;
            }
        else
            return volatileSingleton;
    }
}
