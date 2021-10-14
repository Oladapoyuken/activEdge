package com.example.demo.activEdgeAssessment.exercise_three.repository;

import com.example.demo.activEdgeAssessment.exercise_three.model.Stock;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface StockDao {

    List<Stock> getStocks();

    String create(Stock stock);

//    default String create(Stock stock){
//        int id = ٍ;
//        if(stock.getId() != null) return create(stock.getId(), stock);
//        return create(id, stock);
//    }

    int updateStock(int id, Stock stock);

    Optional<Stock> selectStock(int id);

}
