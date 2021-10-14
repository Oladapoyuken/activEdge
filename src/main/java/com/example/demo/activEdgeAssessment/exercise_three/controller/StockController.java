package com.example.demo.activEdgeAssessment.exercise_three.controller;

import com.example.demo.activEdgeAssessment.exercise_three.model.Stock;
import com.example.demo.activEdgeAssessment.exercise_three.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping(path = "/api/stocks")
public class StockController {


    private final StockService stockService;

    @Autowired
    public StockController(StockService stockService) {

        this.stockService = stockService;
    }


    @PostMapping
    private ResponseEntity<Object> create(@RequestBody Stock stock){

        return new ResponseEntity<>(stockService.create(stock), HttpStatus.OK);
    }

    @PutMapping(path = "/")
    private ResponseEntity<Object> updateStock(@RequestParam("id") int id, @RequestBody Stock stock){
        String res = "Sorry, could not update stock";
        if(stockService.updateStock(id, stock) == 1) res = "Stock updated successfully";
        return new ResponseEntity<>(res, HttpStatus.OK);

    }

    @GetMapping(path = "/")
    private ResponseEntity<Object> selectStock(@RequestParam("id") int id){

        return new ResponseEntity<>(stockService.selectStock(id), HttpStatus.OK);
    }

    @GetMapping
    private ResponseEntity<Object> getStocks(){

        return new ResponseEntity<>(stockService.getStocks(), HttpStatus.OK);
    }




}
