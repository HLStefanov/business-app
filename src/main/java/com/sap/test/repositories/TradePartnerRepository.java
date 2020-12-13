package com.sap.test.repositories;

import com.sap.test.model.Catalogue;
import com.sap.test.model.Client;
import com.sap.test.model.Product;
import com.sap.test.model.TradePartner;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public interface TradePartnerRepository extends JpaRepository<TradePartner,Integer> {
    Optional<TradePartner> findTradePartnerByName(String name);

    Optional<List<Product>> getProductList();
    
    List<Client> getClients();

    List<Catalogue> getCatalogueList();

    void setProductList(List<Product> products);


    void setCatalogueList(Catalogue catalogue);
}
