package com.julioluis.dependencyinversion.processes;


import org.springframework.stereotype.Component;

@Component
public class SmartPhoneManufactorProccess extends GeneralProcessManufactorProccess {

    @Override
    protected void assambleDevice() {
        System.out.println("assabled smart phone");
    }

    @Override
    protected void testDevice() {
        System.out.println("tested smart phone");
    }

    @Override
    protected void packageDevice() {
        System.out.println("packaged smart phone");
    }

    @Override
    protected void storeDevice() {
        System.out.println("stored smart phone");
    }
}
