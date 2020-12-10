package com.sap.test.model;

import javax.persistence.*;

@Entity(name = "clients")
@Table(name = "clients")
public class Client {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer client_id;
    @Column(nullable = false,name = "client_id", length = 50)
    private String name;
    @Column(nullable = false, length = 50)
    private String password;
    @ManyToOne
    private TradePartner partner;

    protected Client(){

    }

    public Client(String name, String password){
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setName(String client_name) {
        this.name = client_name;
    }

    public Integer getClient_id() {
        return client_id;
    }

    public void setClient_id(Integer client_id) {
        this.client_id = client_id;
    }
}
