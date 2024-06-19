package com.demoProject.frameworkTour.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demoProject.frameworkTour.entity.Movie;
import com.demoProject.frameworkTour.repository.MovieRepository;

@RestController
@RequestMapping("/movies")
public class MoviesController {

    @Autowired
    private MovieRepository movieRepo;

    @GetMapping("")
    public List<Movie> getAll() {
        return movieRepo.findAll();
    }
    
}
