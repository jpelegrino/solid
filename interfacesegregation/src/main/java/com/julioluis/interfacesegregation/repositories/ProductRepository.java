package com.julioluis.interfacesegregation.repositories;

import com.julioluis.interfacesegregation.model.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductRepository {

    public List<Product> findAll() {
        List<Product> products=new ArrayList<>();
        Product product = new Product();
        product.setName("TV");

        Product product2 = new Product();
        product2.setName("Smartphone");

        products.add(product);
        products.add(product2);

        return products;

    }
}
