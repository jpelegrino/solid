package com.julioluis.interfacesegregation.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AccountProccess {

    @Autowired
    private Accounting accounting;

    public void executeTransaction() {
        accounting.chargeCustomer();
        accounting.prepareInvoice();
    }


}
