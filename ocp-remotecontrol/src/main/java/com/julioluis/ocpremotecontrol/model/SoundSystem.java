package com.julioluis.ocpremotecontrol.model;

import org.springframework.stereotype.Component;

@Component
public class SoundSystem implements Device {

    @Override
    public void turnOn() {
        System.out.println("Turn On the Sound System");
    }

    @Override
    public void turnOff() {
        System.out.println("Turn Off the Sound System");
    }
}
