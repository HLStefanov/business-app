package com.sap.test.controller.partner;

import com.sap.test.model.*;
import com.sap.test.repositories.TradePartnerRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TradePartnerService {

  private final TradePartnerRepository repository;


    public TradePartnerService(TradePartnerRepository repository) {
        this.repository = repository;
    }

    public void addPartner(String name, String passwd){
        repository.save(new TradePartner(name,passwd));
    }

    public List<TradePartner> getPartners(){
        return repository.findAll();
    }

    public TradePartner getPartnerByName(String name){
        Optional<TradePartner> optionalAdministrator = repository.findTradePartnerByName(name);
        return optionalAdministrator.orElse(new TradePartner(" "," "));
    }

    public TradePartner getPartnerByID(Integer id){
        Optional<TradePartner> optional = repository.findById(id);

        return optional.orElse(new TradePartner(" ", " "));
    }

    public List<Product> getProducts(){
        List<Product> products;
        products = repository.getProductList().orElse(new ArrayList<>());

        return products;
    }

    public Product getProductByName(String name){

        Optional<List<Product>> optional = repository.getProductList();
        List <Product> productList = optional.orElse(new ArrayList<>());

        if(!productList.isEmpty()){
            for (Product product : productList) {
                if(product.getName().equals(name)) return product;
            }
        }

        return new Product(" ", 0.0);
    }

    public Product getProductById(Integer id){

        Optional<List<Product>> optional = repository.getProductList();
        List <Product> productList = optional.orElse(new ArrayList<>());

        if(!productList.isEmpty()){
            for (Product product : productList) {
                if(product.getId() == id) return product;
            }
        }

        return new Product(" ", 0.0);
    }



    public List<Client> getClients(){
        return repository.getClients();
    }

    public Client getClientByName(String name){
        List<Client> clients = getClients();

        if(!clients.isEmpty()){
            for (Client client : clients) {
                if(client.getName().equals(name)) return client;
            }
        }
        return new Client(" "," ");
    }

    public Client getClientByID(Integer id){
        List<Client> clients = getClients();

        if(!clients.isEmpty()){
            for (Client client : clients) {
                if(client.getId() == id) return client;
            }
        }

        return new Client(" ", " ");
    }

    public List<Catalogue> getCatalogues(){
        return  repository.getCatalogueList();
    }

    public Catalogue getCatalogueByName(String name){
        List<Catalogue> catalogues = getCatalogues();

        if(!catalogues.isEmpty()){
            for (Catalogue catalogue : catalogues) {
                if(catalogue.getName().equals(name)) return catalogue;
            }
        }
        return new Catalogue(" ",0.0);
    }

    public Catalogue getCatalogueByID(Integer id){
        List<Catalogue> catalogues = getCatalogues();

        if(!catalogues.isEmpty()){
            for (Catalogue catalogue : catalogues) {
                if(catalogue.getId() == id) return catalogue;
            }
        }

        return new Catalogue(" ", 0.0);
    }

    public void addProduct(String name,double price){

        List<Product> products;
        products = repository.getProductList().orElse(new ArrayList<>());

        products.add(new Product(name,price));
        repository.setProductList(products);
    }



    public void addClient(String name,double password){

        List<Product> products;
        products = repository.getProductList().orElse(new ArrayList<>());

        products.add(new Product(name,password));
        repository.setProductList(products);
    }

    public void addCatalogue(Catalogue catalogue){

        List<Catalogue> products;
        products = repository.getCatalogueList();

        products.add(catalogue);
        repository.setCatalogueList(catalogue);
    }

    public void removeProduct(String name){

        List<Product> products = getProducts();
        products.removeIf(pr -> pr.getName().equals(name));
    }

    public void removeClient(String name){
        List<Client> clients = getClients();
        clients.removeIf(client -> client.getName().equals(name));
    }

    public void removeCatalogue(String name){
        List<Catalogue> catalogues = getCatalogues();
        catalogues.removeIf(catalogue -> catalogue.getName().equals(name));
    }


    public void removePartner(String name){
        List<TradePartner> partners = getPartners();
        partners.removeIf(partner -> partner.getName().equals(name));
    }

}
