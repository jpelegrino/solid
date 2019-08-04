package com.julioluis.ocpremotecontrol.model;

import org.springframework.stereotype.Component;

@Component
public class Projector implements Device {

    @Override
    public void turnOn() {
        System.out.println("Turn On the Projector");
    }

    @Override
    public void turnOff() {
        System.out.println("Turn Off the Projector");
    }
}
