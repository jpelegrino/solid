package com.julioluis.dependencyinversion.processes;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
public class ComputerManufactorProccess extends GeneralProcessManufactorProccess {

    @Override
    protected void assambleDevice() {
        System.out.println("assabled Computer");
    }

    @Override
    protected void testDevice() {
        System.out.println("tested Computer");
    }

    @Override
    protected void packageDevice() {
        System.out.println("packaged Computer");
    }

    @Override
    protected void storeDevice() {
        System.out.println("stored Computer");
    }
}
