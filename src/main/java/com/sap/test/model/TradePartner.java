package com.sap.test.model;

import javax.persistence.*;

@Entity(name = "trade_partners")
public class TradePartner {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer partner_id;
    private String partner_name;
    private String password;
    @ManyToOne
    private Administrator administrator;
    @ManyToOne
    private Catalogue catalogue;

    protected TradePartner() {

    }

    public TradePartner(Integer partner_id, String partner_name, String password) {
        this.partner_name = partner_name;
        this.password = password;
        this.partner_id = partner_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPartner_name() {
        return partner_name;
    }

    public void setPartner_name(String partner_name) {
        this.partner_name = partner_name;
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