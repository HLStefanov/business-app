package com.sap.test.repositories;

import com.sap.test.model.Administrator;
import com.sap.test.model.Catalogue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatalogueRepository extends JpaRepository<Catalogue, Integer> {
}
