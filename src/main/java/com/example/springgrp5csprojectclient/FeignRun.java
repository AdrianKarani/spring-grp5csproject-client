package com.example.springgrp5csprojectclient;

import com.example.springgrp5csprojectclient.models.Category;
import com.example.springgrp5csprojectclient.models.Movie;
import com.example.springgrp5csprojectclient.models.Type;
import com.example.springgrp5csprojectclient.models.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FeignRun implements CommandLineRunner {

    private final FeignClient feignClient;

    public FeignRun(FeignClient feignClient) {
        this.feignClient = feignClient;
    }

    @Override
    public void run(String... args) throws Exception {

        // 1. Movies

        // List all movies
        List<Movie> findAllM = feignClient.findAllMovies();
        System.out.println("All Movies: " + findAllM.toString());

        // Pick one movie
        Movie pickOneM = feignClient.findOneMovie(23L);
        System.out.println("Movie Found: " + pickOneM.toString());

        // Get All movies in a particular category and owned by the user
        List<Movie> getAllM = feignClient.findMovies(new Type("suggested"),5L);
        System.out.println("Your movies: " + getAllM.toString());

        // Suggest a movie
        Movie suggestM = feignClient.suggestMovie(new Movie("Transformers"));
        System.out.println("You've suggested: " + suggestM.toString());

        // Update movie details
        Movie updateM = feignClient.updateMovie(1L,1L, new Movie("Shrek 2"));
        System.out.println("Update successful: " + updateM.toString());

        // Delete a movie
        Movie deleteM = feignClient.deleteMovie(1L, 1L);
        System.out.println("Delete Successful: " + deleteM.toString());


        // 2. Users

        // Create account
        User createU = feignClient.createUser(new User(1234L, "John Doe"));
        System.out.println("Account created: " + createU.toString());

        // Delete account
        User deleteU = feignClient.deleteUser(1L);
        System.out.println("Account deleted: " + deleteU.toString());


        // 3. Categories

        // Find all categories
        Category findAllC = feignClient.findAllCategories(2L);
        System.out.println("The categories are: " + findAllC.toString());
    }
}
