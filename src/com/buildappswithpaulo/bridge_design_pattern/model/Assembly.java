package com.buildappswithpaulo.bridge_design_pattern.model;

import com.buildappswithpaulo.bridge_design_pattern.controller.Workshop;

public class Assembly implements Workshop {
    @Override
    public void make() {
        System.out.println("...also");
        System.out.println("Assembled");
    }
}
