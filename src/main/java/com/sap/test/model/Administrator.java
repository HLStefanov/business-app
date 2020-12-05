package com.sap.test.model;


import javax.persistence.*;

@Entity(name = "administrators")
public class Administrator {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String name;
    @ManyToOne
    private Catalogue catalogue_id;
    private String password;

    protected Administrator(){

    }

    public Administrator(Integer id,String name, String password){
        this.name = name;
        this.password = password;
        this.id = id;
    }




    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Catalogue getCatalogue_id() {
        return catalogue_id;
    }

    public void setCatalogue_id(Catalogue catalogue_id) {
        this.catalogue_id = catalogue_id;
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
}
