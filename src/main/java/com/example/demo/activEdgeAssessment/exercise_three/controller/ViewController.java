package com.example.demo.activEdgeAssessment.exercise_three.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ViewController {

    @RequestMapping(value = "/view-stock")
    public String viewProduct(){return "view-stock";}

}
