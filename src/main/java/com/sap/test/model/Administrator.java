package com.sap.test.model;



import javax.persistence.*;

@Entity(name = "administrators")
@Table(name = "administrators")
public class Administrator {


    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 50)
    private String name;
    @ManyToOne
    private Catalogue catalogue_id;
    @Column(nullable = false, length = 50)
    private String password;

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
