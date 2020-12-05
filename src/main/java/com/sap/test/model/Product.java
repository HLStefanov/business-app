package com.sap.test.model;


import javax.persistence.*;

@Entity(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer product_id;

    private String product_name;
    private double product_price;

    @ManyToOne
    private Administrator administrator;
    @ManyToOne
    private Catalogue catalogue;
    @ManyToOne
    private TradePartner partner;
    @ManyToOne
    private Client client;


    protected Product(){ }

    public Product(Integer product_id, String product_name, double price){
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_price = price;
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

    public double getProduct_price() {
        return product_price;
    }

    public void setProduct_price(double product_price) {
        this.product_price = product_price;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }
}
