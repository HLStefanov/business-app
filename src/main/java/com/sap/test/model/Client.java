package com.sap.test.model;

import javax.persistence.*;

@Entity(name = "clients")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer client_id;
    private String client_name;
    private String password;
    @ManyToOne
    private TradePartner partner;

    protected Client(){

    }

    public Client(Integer client_id, String client_name, String password){
        this.client_id = client_id;
        this.client_name = client_name;
        this.password = password;

    }

    public TradePartner getPartner() {
        return partner;
    }

    public void setPartner(TradePartner partner) {
        this.partner = partner;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getClient_name() {
        return client_name;
    }

    public void setClient_name(String client_name) {
        this.client_name = client_name;
    }

    public Integer getClient_id() {
        return client_id;
    }

    public void setClient_id(Integer client_id) {
        this.client_id = client_id;
    }
}
