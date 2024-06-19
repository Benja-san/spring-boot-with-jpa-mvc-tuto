package com.demoProject.frameworkTour.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demoProject.frameworkTour.entity.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
    
}
