package com.example.demo.activEdgeAssessment.exercise_three.service;


import com.example.demo.activEdgeAssessment.exercise_three.model.Stock;
import com.example.demo.activEdgeAssessment.exercise_three.repository.StockDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class StockService {

    private StockDao stockDao;

    @Autowired
    public StockService(StockDao stockDao) {
        this.stockDao = stockDao;
    }

    public String create(Stock stock){return stockDao.create(stock);}

    public List getStocks(){return stockDao.getStocks();}

    public int updateStock(UUID id, Stock stock){return stockDao.updateStock(id, stock);}

    public Optional<Stock> selectStock(UUID id){

        return stockDao.selectStock(id);
    }




}
