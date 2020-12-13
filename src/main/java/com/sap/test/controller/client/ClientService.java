package com.sap.test.controller.client;

import com.sap.test.model.Client;
import com.sap.test.model.Product;
import com.sap.test.repositories.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientService {

    private final ClientRepository repository;

    public ClientService(ClientRepository repository) {
        this.repository = repository;
    }

    public void addClient(String name, String pass){
        repository.save(new Client(name,pass));
    }

    public List<Product> getProducts(){
        List<Product> products;
        products = repository.getProductList().orElse(new ArrayList<>());

        return products;
    }

    public Product getProductByName(String name){

        List <Product> productList = getProducts();

        if(!productList.isEmpty()){
            for (Product product : productList) {
                if(product.getName().equals(name)) return product;
            }
        }

        return new Product(" ", 0.0);
    }

    public Product getProductById(Integer id){

        List <Product> productList = getProducts();

        if(!productList.isEmpty()){
            for (Product product : productList) {
                if(product.getId() == id) return product;
            }
        }

        return new Product(" ", 0.0);
    }


}
