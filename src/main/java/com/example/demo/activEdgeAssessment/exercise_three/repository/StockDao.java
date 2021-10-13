package com.example.demo.activEdgeAssessment.exercise_three.repository;

import com.example.demo.activEdgeAssessment.exercise_three.model.Stock;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface StockDao {

    List<Stock> getStocks();

    String create(UUID id, Stock stock);

    default String create(Stock stock){
        UUID id = UUID.randomUUID();
        if(stock.getId() != null) return create(stock.getId(), stock);
        return create(id, stock);
    }

    int updateStock(UUID id, Stock stock);

    Optional<Stock> selectStock(UUID id);

}
