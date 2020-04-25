package com.buildappswithpaulo.bridge_design_pattern;

import com.buildappswithpaulo.bridge_design_pattern.model.Car;
import com.buildappswithpaulo.bridge_design_pattern.model.Make;
import com.buildappswithpaulo.bridge_design_pattern.model.Vehicle;
import com.buildappswithpaulo.bridge_design_pattern.model.Assembly;

public class Main {
    public static void main(String[] args) {
        Vehicle BMW = new Car(new Make(), new Assembly());
        BMW.manufacture();
    }
}
