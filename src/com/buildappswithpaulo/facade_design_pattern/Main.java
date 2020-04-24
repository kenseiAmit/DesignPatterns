package com.buildappswithpaulo.facade_design_pattern;

import com.buildappswithpaulo.facade_design_pattern.model.CPU;
import com.buildappswithpaulo.facade_design_pattern.model.ComputerFacade;
import com.buildappswithpaulo.facade_design_pattern.model.HardDrive;
import com.buildappswithpaulo.facade_design_pattern.model.Memory;

public class Main {
    public static void main(String[] args) {
        CPU cpu = new CPU();
        Memory memory = new Memory();
        HardDrive hdd = new HardDrive();

        ComputerFacade computerFacade = new ComputerFacade(cpu, memory, hdd);
        computerFacade.start();
    }

}
