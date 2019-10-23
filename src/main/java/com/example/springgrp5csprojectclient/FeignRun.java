package com.example.springgrp5csprojectclient;

import com.example.springgrp5csprojectclient.models.Category;
import com.example.springgrp5csprojectclient.models.Movie;
import com.example.springgrp5csprojectclient.models.User;
import org.graalvm.compiler.lir.LIRInstruction;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import sun.nio.cs.US_ASCII;

import java.net.UnknownServiceException;
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

        // GET

        // List all movies
        List<Movie> allMovies = feignClient.getAllMovies();
        System.out.println("All Movies: " + allMovies.toString());

        // Get All movies in a particular category and owned by the user(Type = suggested)
        List<Movie> ownedMovies = feignClient.findMovies("suggested",5L);
        System.out.println("Your movies: " + ownedMovies.toString());

        // Get the Release Date of the Movie with the movie's name
        Movie releaseDate = feignClient.getReleaseDate("Transformers");
        System.out.println("Release Date: " + releaseDate.toString());

        // Get all Movies that have been Suggested
        List<Movie> suggestedMovies = feignClient.getSuggestedMovies();
        System.out.println("Suggested Movies: " + suggestedMovies.toString());

        // Get all liked movies
        List<Movie> likedMovies = feignClient.getLikedMovies();
        System.out.println("Liked Movies: " + likedMovies.toString());

        // Get all users who suggested a movie
        List<User> suggestion = feignClient.usersWhoSuggested(5L);
        System.out.println("Users who suggested the movie given: " + suggestion.toString());

        // Get all users who liked a movie
        List<User> likes = feignClient.getLikes(5L);
        System.out.println("Users who liked the movie given: " + likes.toString());

        // List a user's Favourite Movies
        List<Movie> favorites = feignClient.getFavorites(5L);
        System.out.println("Your favorites: " + favorites.toString());


        // Suggest a movie
        Movie suggestM = feignClient.postMovie(1L, new Movie("Transformers", "2014"));
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


    }
}
