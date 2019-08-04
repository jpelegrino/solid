package com.julioluis.dependencyinversion.processes;

public abstract class GeneralProcessManufactorProccess {

    protected abstract void assambleDevice();
    protected abstract void testDevice();
    protected abstract void packageDevice();
    protected abstract void storeDevice();

    public void lunchProcess() {
        assambleDevice();
        testDevice();
        packageDevice();
        storeDevice();
    }
}
