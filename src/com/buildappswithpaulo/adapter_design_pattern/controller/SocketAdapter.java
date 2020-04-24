package com.buildappswithpaulo.adapter_design_pattern.controller;

import com.buildappswithpaulo.adapter_design_pattern.model.Volt;

public interface SocketAdapter {
    Volt gerVolt120();
    Volt getVolt40();
    Volt getVolt30();
    Volt getVolt12();
    Volt getVolt3();
    Volt getVolt1();

}
