package com.example.demo.activEdgeAssessment;

public class execise_two {


    String sql = "" +
            "SELECT * FROM T1 " +
            "WHERE name NOT IN " +
            "(SELECT name FROM T2) " +
            "ORDER BY id DESC";
}
