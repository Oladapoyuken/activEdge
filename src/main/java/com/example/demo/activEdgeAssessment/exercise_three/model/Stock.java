package com.example.demo.activEdgeAssessment.exercise_three.model;

import java.time.LocalDate;
import java.util.UUID;

public class Stock {

    private final int id;
    private final String name;
    private final int currentPrice;
    private final LocalDate lastUpdate;
    private final LocalDate createDate;

    public Stock(int id, String name, int currentPrice, LocalDate lastUpdate, LocalDate createDate) {
        this.id = id;
        this.name = name;
        this.currentPrice = currentPrice;
        this.lastUpdate = lastUpdate;
        this.createDate = createDate;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCurrentPrice() {
        return currentPrice;
    }

    public LocalDate getLastUpdate() {
        return lastUpdate;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }
}
