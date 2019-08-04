package com.julioluis.interfacesegregation.model;

import org.springframework.stereotype.Component;

@Component
public class Product {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
