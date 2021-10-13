package com.example.demo.activEdgeAssessment;

public class execise_two {

    String sql = "" +
            "SELECT * FROM `t2` " +
            "WHERE `name` NOT IN " +
            "(SELECT `name` FROM `t1`) " +
            "ORDER BY `id` DESC;";
}
