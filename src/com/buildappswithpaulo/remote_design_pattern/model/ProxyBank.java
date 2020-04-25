package com.buildappswithpaulo.remote_design_pattern.model;

import com.buildappswithpaulo.remote_design_pattern.controller.Bank;

import java.util.ArrayList;
import java.util.List;

public class ProxyBank implements Bank {
    private Bank bank = new RealBnak();
    private static List<String> bannedClients = new ArrayList<>();
    static {
        bannedClients.add("me@me");
        bannedClients.add("robinhooh");
        bannedClients.add("messiah");
    }
    @Override
    public void withdrawMoney(String clientName) throws Exception {
        if (bannedClients.contains(clientName.toLowerCase())) {
            throw new Exception(clientName + " Access Denied! You are not who you say you are:");
        }
        bank.withdrawMoney(clientName);
    }
}
