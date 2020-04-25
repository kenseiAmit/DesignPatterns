package com.buildappswithpaulo.bridge_design_pattern.model;

import com.buildappswithpaulo.bridge_design_pattern.controller.Workshop;

public class Make implements Workshop {
    @Override
    public void make() {
        System.out.println("Making...");
    }
}
