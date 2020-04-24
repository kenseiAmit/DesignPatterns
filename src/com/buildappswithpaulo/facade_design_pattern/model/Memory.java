/*
A simple memory system
 */
package com.buildappswithpaulo.facade_design_pattern.model;

public class Memory {
    public void load(long position, byte[] data) {
        System.out.println("Added item to memory..." + position);
    }
}
