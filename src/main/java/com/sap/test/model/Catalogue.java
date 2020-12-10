package com.sap.test.model;


import javax.persistence.*;

@Entity(name = "catalogue")
@Table(name = "catalogue")
public class Catalogue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer catalogue_id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private double price;

    protected Catalogue(){

    }

    public Catalogue(Integer catalogue_id,String name, double price){
        this.catalogue_id = catalogue_id;
        this.name = name;
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Integer getCatalogue_id() {
        return catalogue_id;
    }

    public void setCatalogue_id(Integer catalogue_id) {
        this.catalogue_id = catalogue_id;
    }
}
