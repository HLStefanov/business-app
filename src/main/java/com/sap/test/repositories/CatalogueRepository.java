package com.sap.test.repositories;

import com.sap.test.model.Administrator;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatalogueRepository extends JpaRepository<Administrator, Integer> {
}
