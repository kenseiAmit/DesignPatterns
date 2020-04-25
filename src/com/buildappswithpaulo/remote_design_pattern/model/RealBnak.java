package com.buildappswithpaulo.remote_design_pattern.model;

import com.buildappswithpaulo.remote_design_pattern.controller.Bank;

public class RealBnak implements Bank {
    @Override
    public void withdrawMoney(String clientName) {
        System.out.println(clientName + " is withdrawing from the ATM");
    }
}
