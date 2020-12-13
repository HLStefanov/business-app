package com.sap.test.repositories;

import com.fasterxml.jackson.annotation.OptBoolean;
import com.sap.test.model.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface AdministratorRepository extends JpaRepository <Administrator, Integer>{

    Optional<Administrator> findAdministratorByName(String name);

    Optional<List<Product>> getProductList();

    Optional<List<TradePartner>> getPartners();

    List<Client> getClients();

    List<Catalogue> getCatalogueList();

    void setProductList(List<Product> productList);

    void setPartnersList(List<TradePartner> partners);

    void setCatalogueList(Catalogue catalogue);


}

