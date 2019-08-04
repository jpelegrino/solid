package com.julioluis.interfacesegregation.services;

import com.julioluis.interfacesegregation.model.Customer;
import com.julioluis.interfacesegregation.model.Product;
import com.julioluis.interfacesegregation.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomerTransaction implements Accounting,Reporting {


    @Autowired
    private ProductRepository productRepository;


    @Override
    public void prepareInvoice() {
        System.out.println("Preparing invoice");
    }

    @Override
    public void chargeCustomer() {
        System.out.println("Charging customer");
    }

    @Override
    public String getProductBreakDown() {
        String productName="";
        for(Product product : productRepository.findAll()) {
            productName+=product.getName()+" ";
        }
        return productName;
    }


}
