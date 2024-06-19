package com.demoProject.frameworkTour.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.demoProject.frameworkTour.entity.Movie;

@Component
public class MovieGeneratorRepository implements CommandLineRunner{

    @Autowired
    private MovieRepository movieRepo;
    Movie movie;

    @Override
    public void run(String... args ) {

        if(movieRepo.count() > 0){
            return;
        }
        List<Movie> movies = new ArrayList<>();
        for(int i = 0; i < 100; i++){
            movie = new Movie(i, "Movie"+i, "movie-"+i, "Movie "+i+" Synopsis", "any genre", "movie"+i+".jpg");
            movies.add(movie);
        }
        movieRepo.saveAll(movies);
    }
    
}
