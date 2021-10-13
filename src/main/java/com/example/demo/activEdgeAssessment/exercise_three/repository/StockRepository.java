package com.example.demo.activEdgeAssessment.exercise_three.repository;

import com.example.demo.activEdgeAssessment.exercise_three.model.Stock;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public class StockRepository implements StockDao{

    List<Stock> stockList = new ArrayList<>();


    @Override
    public List<Stock> getStocks() {
        return stockList;
    }

    @Override
    public String create(UUID id, Stock stock) {
        Stock newStock = new Stock(id,
                stock.getName(),
                stock.getCurrentPrice(),
                LocalDate.now(),
                LocalDate.now());
        stockList.add(newStock);
        return "Stock added successfully";
    }

    @Override
    public Optional<Stock> selectStock(UUID id) {
        return stockList.stream()
                .filter(stock -> stock.getId().equals(id))
                .findFirst();
    }

    @Override
    public int updateStock(UUID id, Stock stock) {

        return selectStock(id).map(
                p -> {
                    int index = stockList.indexOf(p);
                    if(index >= 0){
                        stockList.set(index, new Stock(id, p.getName(), stock.getCurrentPrice(), LocalDate.now(), p.getCreateDate()));
                        return 1;
                    }
                    return 0;
                }).orElse(0);
    }
}
