package com.sap.test.model;


import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity(name = "administrators")
public class Administrator {


    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 50)
    private String name;

    @Column(nullable = false, length = 50)
    private String password;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    private List<Product> productList;


    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    private List<TradePartner> partners;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    private List<Catalogue> catalogueList;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    private List<Client> clients;

    protected Administrator(){

    }

    public Administrator(String name, String password){
        this.name = name;
        this.password = password;
    }




    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public List<TradePartner> getPartners() {
        return partners;
    }

    public void setPartners(List<TradePartner> partners) {
        this.partners = partners;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    public List<Catalogue> getCatalogueList() {
        return catalogueList;
    }

    public void setCatalogueList(List<Catalogue> catalogues) {
        this.catalogueList = catalogues;
    }
}
