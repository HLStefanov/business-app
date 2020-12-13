package com.sap.test.repositories;

import com.sap.test.model.Client;
import com.sap.test.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ClientRepository extends JpaRepository<Client, Integer> {

    Optional<Client> findClientByName(String name);

    Optional<List<Product>> getProductList();
}
