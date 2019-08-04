package com.julioluis.ocpremotecontrol;

import com.julioluis.ocpremotecontrol.model.Device;
import org.springframework.stereotype.Component;

@Component
public class RemoteControl {

    private Device device;

    private RemoteControl() {}

    public static RemoteControl getInstance() {
        return new  RemoteControl();
    }

    public void connect(Device device) {
        this.device=device;
    }

    public void turnOn() {
        device.turnOn();
    }

    public void turnOff(){
        device.turnOff();
    }
}
