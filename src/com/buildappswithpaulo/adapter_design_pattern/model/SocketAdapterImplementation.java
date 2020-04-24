package com.buildappswithpaulo.adapter_design_pattern.model;

import com.buildappswithpaulo.adapter_design_pattern.controller.SocketAdapter;

public class SocketAdapterImplementation extends Socket implements SocketAdapter {
    public SocketAdapterImplementation() {

    }

    @Override
    public Volt gerVolt120() {
        return super.getVolt();
    }

    @Override
    public Volt getVolt40() {
        return new Volt(super.getVolt().getVolt()/3);
    }

    @Override
    public Volt getVolt30() {
        return new Volt(super.getVolt().getVolt()/4);
    }

    @Override
    public Volt getVolt12() {
        return new Volt(super.getVolt().getVolt()/10);
    }

    @Override
    public Volt getVolt3() {
        return new Volt(super.getVolt().getVolt()/40);
    }

    @Override
    public Volt getVolt1() {
        return new Volt(super.getVolt().getVolt()/120);
    }
}
