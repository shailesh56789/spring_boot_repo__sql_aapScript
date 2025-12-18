package com.example.sql_project.service;


import com.example.sql_project.Domain.Market;

import java.util.List;

public interface MarketingService {

    // Single record save
    Market saveMarket(Market market);

    // Bulk save (Google Sheet use case)
    List<Market> saveAllMarkets(List<Market> markets);

    // Fetch all records
    List<Market> getAllMarkets();

    // Check duplicate by ID
    boolean existsById(String id);

}
