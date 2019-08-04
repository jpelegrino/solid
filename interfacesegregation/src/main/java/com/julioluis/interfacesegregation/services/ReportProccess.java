package com.julioluis.interfacesegregation.services;

import com.julioluis.interfacesegregation.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ReportProccess {

    @Autowired
    private Reporting reporting;

    public void printReport() {
        System.out.println(reporting.getProductBreakDown());
    }
}
