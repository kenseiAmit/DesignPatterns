package com.buildappswithpaulo.singleton_design_pattern;

import com.buildappswithpaulo.singleton_design_pattern.controller.EagerSingleton;
import com.buildappswithpaulo.singleton_design_pattern.controller.LazySingleton;
import com.buildappswithpaulo.singleton_design_pattern.controller.SimpleSingleton;
import com.buildappswithpaulo.singleton_design_pattern.controller.VolatileSingleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the main function of the Singleton package...");

        VolatileSingleton volatileSingleton = VolatileSingleton.fetchVolatileSingleton();
        volatileSingleton.name = "My name is Anthony Gonsalves";
        System.out.println("The singleton in the main is: " + volatileSingleton);
        //System.out.println("The singleton in the singleton in the maine is: " + singleton.);
        System.out.println("The nmme in the singleton in the main is: " + volatileSingleton.name);


        VolatileSingleton anothervolatileSingleton = VolatileSingleton.fetchVolatileSingleton();
        System.out.println("The singleton in the main is: " + anothervolatileSingleton);
    }
}
