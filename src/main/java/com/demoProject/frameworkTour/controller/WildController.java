package com.demoProject.frameworkTour.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WildController{
    
    @GetMapping("/atelier")
    @ResponseBody
    public String workshop(){
        return "Introduction à Spring";
    }

}
