package com.sap.test.repositories;

import com.fasterxml.jackson.annotation.OptBoolean;
import com.sap.test.model.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface AdministratorRepository extends JpaRepository <Administrator, Integer>{

    Optional<Administrator> findAdministratorByName(String name);

    Optional<List<Product>> getProducts();

    Optional<List<TradePartner>> getPartners();

    List<Client> getClients();

    List<Catalogue> getCatalogues();

    void setProducts(List<Product> productList);

    void setPartners(List<TradePartner> partners);

    void setCatalogues(List<Catalogue> catalogues);


}

