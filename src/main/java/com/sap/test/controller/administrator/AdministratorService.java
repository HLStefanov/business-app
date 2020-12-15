package com.sap.test.controller.administrator;

import com.sap.test.model.*;
import com.sap.test.repositories.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AdministratorService {


   private final AdministratorRepository repository;

    public List<Administrator> getAdmins(){
        return repository.findAll();
    }

    public AdministratorService(AdministratorRepository administratorRepository) {
        this.repository = administratorRepository;
    }

    public Administrator getAdminByName(String name){
        Optional<Administrator> optionalAdministrator = repository.findAdministratorByName(name);
        return optionalAdministrator.orElse(new Administrator(" "," "));
    }

    public Administrator getAdminByID(Integer id){
        Optional<Administrator> optional = repository.findById(id);

        return optional.orElse(new Administrator(" ", " "));
    }

    public List<Product> getProducts(){
        List<Product> products;
        products = repository.getProducts().orElse(new ArrayList<>());

        return products;
    }

    public Product getProductByName(String name){

        Optional<List<Product>> optional = repository.getProducts();
        List <Product> productList = optional.orElse(new ArrayList<>());

        if(!productList.isEmpty()){
            for (Product product : productList) {
                if(product.getName().equals(name)) return product;
            }
        }

        return new Product(" ", 0.0);
    }

    public Product getProductById(Integer id){

        Optional<List<Product>> optional = repository.getProducts();
        List <Product> productList = optional.orElse(new ArrayList<>());

        if(!productList.isEmpty()){
            for (Product product : productList) {
                if(product.getId() == id) return product;
            }
        }

        return new Product(" ", 0.0);
    }
    public TradePartner getPartnerByName(String name){

        List<TradePartner> partners = getPartners();

        if(!partners.isEmpty()){
            for (TradePartner partner : partners) {
                if(partner.getName().equals(name)) return partner;
            }
        }

        return new TradePartner(" ", " ");
    }

    public List<TradePartner> getPartners(){
        List <TradePartner> partners;
        partners = repository.getPartners().orElse(new ArrayList<>());

        return partners;
    }

    public TradePartner getPartnerByID(Integer id){

        List<TradePartner> productList = getPartners();

        if(!productList.isEmpty()){
            for (TradePartner partner : productList) {
                if(partner.getId() == id) return partner;
            }
        }

        return new TradePartner(" ", " ");
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
       return  repository.getCatalogues();
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

    public void addAdmin(String name, String password){
        repository.save(new Administrator(name,password));
    }

    public void addProduct(String name,double price){

        List<Product> products;
        products = repository.getProducts().orElse(new ArrayList<>());

        products.add(new Product(name,price));
        repository.setProducts(products);
    }

    public void addPartner(String name,String password){

        List<TradePartner> partners;
        partners = repository.getPartners().orElse(new ArrayList<>());

        partners.add(new TradePartner(name,password));
        repository.setPartners(partners);
    }

    public void addClient(String name,double password){

        List<Product> products;
        products = repository.getProducts().orElse(new ArrayList<>());

        products.add(new Product(name,password));
        repository.setProducts(products);
    }

    public void addCatalogue(Catalogue catalogue){

        List<Catalogue> products;
        products = repository.getCatalogues();

        products.add(catalogue);
        repository.setCatalogues(products);
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

    public void removeAdmin(String name){

        List<Administrator> administrators = getAdmins();
        administrators.removeIf(pr -> pr.getName().equals(name));
    }
}


