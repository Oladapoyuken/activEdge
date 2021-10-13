package com.example.demo.activEdgeAssessment.exercise_three.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

public class Stock {

    private final UUID id;
    private final String name;
    private final int currentPrice;
    private final LocalDateTime lastUpdate;
    private final LocalDateTime createDate;


    public Stock(UUID id, String name, int currentPrice, LocalDateTime lastUpdate, LocalDateTime createDate) {
        this.id = id;
        this.name = name;
        this.currentPrice = currentPrice;
        this.lastUpdate = lastUpdate;
        this.createDate = createDate;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCurrentPrice() {
        return currentPrice;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }
}
