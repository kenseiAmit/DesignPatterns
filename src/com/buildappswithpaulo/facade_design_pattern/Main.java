/*
The program implements a computer system
The computer system has may classes including CPU, Memory, and Hard Drive
All these systems need to be fired up during boot
The facade design pattern makes a interface for the user to simply
start a system without knowing the internal details of the system
The command design pattern also does something similar,
but it concerns more with execution of some commands rather than
encapsulating a complicated process
 */
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

        // The facade takes up all the necessary components
        // and then fires up the complicated system
        ComputerFacade computerFacade = new ComputerFacade(cpu, memory, hdd);
        computerFacade.start();
    }

}
