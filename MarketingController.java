package com.example.sql_project.controller;

import com.example.sql_project.Domain.Market;
import com.example.sql_project.service.MarketingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MarketingController {
    @Autowired
    private MarketingService marketingService;

    public MarketingController(MarketingService marketingService) {
        this.marketingService = marketingService;
    }

    /**
     * 🔹 Bulk Insert API
     * Used by Google Apps Script
     */
    @PostMapping("/insert")
    public ResponseEntity<?> insertMarketData(@RequestBody List<Market> markets) {

        Map<String, Object> response = new HashMap<>();

        try {
            List<Market> savedData = marketingService.saveAllMarkets(markets);

            response.put("status", "success");
            response.put("totalReceived", markets.size());
            response.put("totalInserted", savedData.size());
            response.put("message", "Market data inserted successfully");

            return new ResponseEntity<>(response, HttpStatus.CREATED);

        } catch (Exception e) {
            response.put("status", "error");
            response.put("message", e.getMessage());

            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /**
     * 🔹 Get all records
     */
    @GetMapping("/all")
    public ResponseEntity<List<Market>> getAllMarkets() {
        return ResponseEntity.ok(marketService.getAllMarkets());
    }

    /**
     * 🔹 Check duplicate by ID
     */
    @GetMapping("/exists/{id}")
    public ResponseEntity<Boolean> checkDuplicate(@PathVariable String id) {
        return ResponseEntity.ok(marketService.existsById(id));
    }

}
