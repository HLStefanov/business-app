package com.sap.test.repositories;

import com.sap.test.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {

    public Product findProductByName(String name);
}
