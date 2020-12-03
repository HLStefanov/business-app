package com.sap.test.repositories;

import com.sap.test.model.Administrator;
import com.sap.test.model.TradePartner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdministratorRepository extends JpaRepository <Administrator, Integer>{
    TradePartner findPartnerById(Integer id);

}
