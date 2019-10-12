package com.example.springgrp5csprojectclient;

import com.example.springgrp5csprojectclient.models.Movie;
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

        // Get all movies
        // TODO: Factor in relationship and switch from string to structure of type Type class
        List<Movie> getAllM = feignClient.findMovies("suggested",5L);
        System.out.println("Your movies: " + getAllM.toString());

        // Suggest a movie
        Movie suggestM = feignClient.suggestMovie(new Movie("Transformers", "12th December"));
        System.out.println("You've suggested: " + suggestM.toString());

        // Update movie details
        Movie updateM = feignClient.updateMovie(1L,1L);
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
    }
}
