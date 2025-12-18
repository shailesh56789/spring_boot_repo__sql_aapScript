package com.example.sql_project.repository;

import com.example.sql_project.Domain.Market;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarketingRepository extends JpaRepository<Market, String>
{

    }


