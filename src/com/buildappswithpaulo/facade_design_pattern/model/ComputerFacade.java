package com.buildappswithpaulo.facade_design_pattern.model;

import java.lang.ref.PhantomReference;

public class ComputerFacade {
    private CPU prcessor;
    private Memory ram;
    private HardDrive hdd;

    public ComputerFacade(CPU prcessor, Memory ram, HardDrive hdd) {
        this.prcessor = prcessor;
        this.ram = ram;
        this.hdd = hdd;
    }
    public void start() {
        prcessor.freeze();
        ram.load(132, hdd.read(3456, 89));
        prcessor.jump(132);
        prcessor.execute();
    }
}
