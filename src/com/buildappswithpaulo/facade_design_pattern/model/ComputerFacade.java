/*
Ths is the facade for booting a computer
The facade requires all the elements it needs to work with
and a process to execute the facade
 */
package com.buildappswithpaulo.facade_design_pattern.model;


public class ComputerFacade {
    private CPU prcessor;
    private Memory ram;
    private HardDrive hdd;

    // The constructor for the facade
    public ComputerFacade(CPU prcessor, Memory ram, HardDrive hdd) {
        this.prcessor = prcessor;
        this.ram = ram;
        this.hdd = hdd;
    }

    // The facade boots up the computer for the user
    public void start() {
        prcessor.freeze();
        ram.load(132, hdd.read(3456, 89));
        prcessor.jump(132);
        prcessor.execute();
    }
}
