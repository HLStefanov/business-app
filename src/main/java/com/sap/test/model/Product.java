package com.sap.test.model;


import javax.persistence.*;

@Entity(name = "products")
@Table(name = "products")
public class Product {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer product_id;

    @Column(nullable = false, name = "product_name")
    private String name;

    @Column(nullable = false, name = "product_price")
    private double price;

    @ManyToOne
    private Administrator administrator;
    @ManyToOne
    private Catalogue catalogue;
    @ManyToOne
    private TradePartner partner;
    @ManyToOne
    private Client client;


    protected Product(){ }

    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client_id) {
        this.client = client_id;
    }

    public TradePartner getPartner() {
        return partner;
    }

    public void setPartner(TradePartner partner_id) {
        this.partner = partner_id;
    }

    public Catalogue getCatalogue() {
        return catalogue;
    }

    public void setCatalogue(Catalogue catalogue_id) {
        this.catalogue = catalogue_id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double product_price) {
        this.price = product_price;
    }

    public String getName() {
        return name;
    }

    public void setName(String product_name) {
        this.name = product_name;
    }

    public Administrator getAdministrator() {
        return administrator;
    }

    public void setAdministrator(Administrator administrator) {
        this.administrator = administrator;
    }
}
