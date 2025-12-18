package com.example.sql_project.service;

import com.example.sql_project.Domain.Market;
import com.example.sql_project.repository.MarketingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarketingServiceImp implements MarketingService {

    private final MarketingRepository repo;

    public MarketingServiceImp(MarketingRepository repo) {
        this.repo = repo;
    }


    @Override
    public Market saveMarket(Market market) {
        return null;
    }

    @Override
    public List<Market> saveAllMarkets(List<Market> markets) {
        return List.of();
    }

    @Override
    public List<Market> getAllMarkets() {
        return List.of();
    }

    @Override
    public boolean existsById(String id) {
        return false;
    }
}
