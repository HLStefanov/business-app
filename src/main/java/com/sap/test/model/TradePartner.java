package com.sap.test.model;

import javax.persistence.*;

@Entity(name = "trade_partners")
@Table(name = "trade_partners")
public class TradePartner {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer partner_id;
    @Column(nullable = false, length = 50, name = "partner_name")
    private String name;
    @Column(nullable = false, length = 50)
    private String password;
    @ManyToOne
    private Administrator administrator;
    @ManyToOne
    private Catalogue catalogue;

    protected TradePartner() {

    }

    public TradePartner(String name, String password) {
        this.name = name;
        this.password = password;

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String partner_name) {
        this.name = partner_name;
    }

    public Integer getPartner_id() {
        return partner_id;
    }

    public void setPartner_id(Integer partner_id) {
        this.partner_id = partner_id;
    }

    public Catalogue getCatalogue() {
        return catalogue;
    }

    public void setCatalogue(Catalogue catalogue) {
        this.catalogue = catalogue;
    }

    public Administrator getAdministrator() {
        return administrator;
    }

    public void setAdministrator(Administrator administrator) {
        this.administrator = administrator;
    }
}