package com.julioluis.ocpremotecontrol.model;

import org.springframework.stereotype.Component;

@Component
public class TV implements Device {
    @Override
    public void turnOn() {
        System.out.println("Turn On the TV");
    }

    @Override
    public void turnOff() {
        System.out.println("Turn Off the TV");
    }
}
