package com.sap.test.repositories;

import com.sap.test.model.TradePartner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TradePartnerRepository extends JpaRepository<TradePartner,Integer> {
}
