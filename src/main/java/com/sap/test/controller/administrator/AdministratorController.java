package com.sap.test.controller.administrator;


import com.sap.test.model.Administrator;
import com.sap.test.model.Product;
import com.sap.test.model.TradePartner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AdministratorController {


    private final AdministratorService service;

    public AdministratorController(AdministratorService service) {
        this.service = service;
    }

    @GetMapping("/table/{name}")
    public List<Product> getProductsByName(@PathVariable String name){

        List<Product> products = service.getProducts();
        products.removeIf(product -> !product.getName().equals(name));

        return products;
    }

    @GetMapping("/table/{id}")
    public List<Product> getProductsByID(@PathVariable Integer id){

        List<Product> products = service.getProducts();
        products.removeIf(product -> product.getId() != (id));

        return products;
    }

    @GetMapping("/table/{name}")
    public List<TradePartner> getPartnersByName(@PathVariable String name){

        List<TradePartner> partners = service.getPartners();
        partners.removeIf(product -> !product.getName().equals(name));

        return partners;
    }

    @GetMapping("/table/{id}")
    public List<TradePartner> getPartnersByID(@PathVariable Integer id){

        List<TradePartner> partners = service.getPartners();
        partners.removeIf(product -> product.getId() != (id));

        return partners;
    }



}
