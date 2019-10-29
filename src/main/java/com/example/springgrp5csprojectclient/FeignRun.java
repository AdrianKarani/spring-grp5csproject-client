package com.example.springgrp5csprojectclient;

import com.example.springgrp5csprojectclient.models.Category;
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

        // GET
////DONE->// List all movies
//        List<Movie> allMovies = feignClient.getAllMovies();
//        System.out.println("All Movies: " + allMovies.toString());
//
////DONE->// Find one movie
//        Movie getOne = feignClient.getOneMovie(16L);
//        System.out.println("Movie found " + getOne.toString());
//
////DONE->// Get All movies in a particular category and owned by the user(Type = suggested)
//        List<Movie> ownedMovies = feignClient.findMovies("ORIGINAL", 9L);
//        System.out.println("Your movies: " + ownedMovies.toString());
//
////DONE->// Get the Release Date of the Movie with the movie's id
//        String releaseDate = feignClient.getReleaseDate(16L);
//        System.out.println("Release Date : " + releaseDate);
//
////DONE->// Get all suggested movies
//        List<Movie> suggestedMovies = feignClient.getSuggestedMovies();
//        System.out.println("Suggested Movies: " + suggestedMovies.toString());
//
////DONE->// Get all liked movies
//        List<Movie> likedMovies = feignClient.getLikedMovies();
//        System.out.println("Liked Movies: " + likedMovies.toString());
//
////DONE->// Get all users who suggested a movie
//        List<User> suggestion = feignClient.usersWhoSuggested(20L);
//        System.out.println("Users who suggested the movie given: " + suggestion.toString());
//
////DONE->// Get all users who liked a movie
//        List<User> likes = feignClient.getLikes(36L);
//        System.out.println("Users who liked the movie given: " + likes.toString());
//
////DONE->// List a user's Favourite Movies
//        List<Movie> favorites = feignClient.getFavorites(21L);
//        System.out.println("Your favorites: " + favorites.toString());
//
        // POST
//
////DONE->// Suggest a movie
//        Movie suggestM = feignClient.postMovie(21L, new Movie("Mother", "2014"));
//        System.out.println("You've suggested: " + suggestM.toString());

////DONE->// Approve Suggested Movie - Admin only
//        // TODO: Problem is how to know id for movies pending suggestion
//        Movie approveM = feignClient.approveSuggestedMovie(10l, 35l);
//        System.out.println("Movie approved " + approveM.toString());

//
        // PATCH
//
////ERROR>// Update movie details
//        // TODO: Error 404
//        Movie updateM = feignClient.updateMovie(21L, 33L, new Movie("IT FOREVER", "2099"));
//        System.out.println("Update successful: " + updateM.toString());
//
        // DELETE
//
//        // Delete a movie
//        Movie deleteM = feignClient.deleteMovie(1L, 1L);
//        System.out.println("Delete Successful: " + deleteM.toString());


        // 2. Users

        // GET
//
////DONE->// Find all users
//        List<User> getAllUsers = feignClient.getAllUsers();
//        System.out.println("Users " + getAllUsers.toString());
//
////DONE->// View One User
//        User getOneUser = feignClient.getOneUser(21L);
//        System.out.println("Found user " + getOneUser.toString());
//
////DONE->// List all Movies that a user has Suggested
//        // TODO: Check for duplicates
//        List<Movie> getSuggested = feignClient.getSuggestedMovies(21L);
//        System.out.println("Movies suggested: " + getSuggested.toString());

        // POST

////DONE->// Create account: Register
//        User createU = feignClient.createUser(new User("Jane Doe", 1234L));
//        System.out.println("Account created: " + createU.toString());

////ERROR>// User adds a movie to Favourites list
//        Movie addFavoriteMovie = feignClient.addFavorite(21l, 36l);
//        System.out.println("Movie added to favorites: " + addFavoriteMovie.toString());

        // PATCH
//
////ERROR>// Update User
//        User updateU = feignClient.updateUser(21L, new User("Jane Doe Mama yao"));
//        System.out.println("Updated user details: " + updateU.toString());
//
        // DELETE
//
//        // Delete user
//        User deleteU = feignClient.deleteUser(22l,1234l);
//        System.out.println("Account deleted: " + deleteU.toString());


        // 3. Categories

        // GET
//
////DONE->// List all categories
//        List<Category> getAllCategories = feignClient.getAllCategories();
//        System.out.println("Categories: " + getAllCategories.toString());
//
////DONE->// Pick one category
//        Category getOneCategory = feignClient.getOneCategory(1l);
//        System.out.println("Single category: " + getOneCategory.toString());
//
        // POST
//
////ERROR>// Create a Category
//        Category createC = feignClient.createCategory(10l, new Category( "Nonsense"));
//        System.out.println("Created category: " + createC.toString());
//
        // PATCH
//
//        // Update a Category
//        Category updateC = feignClient.updateCategory(22l,2l, new Category(2l, "Thriller main"));
//        System.out.println("Updated: " + updateC);
//
        // DELETE
//
//        // Delete a Category
//        Category deleteC = feignClient.deleteCategory(22l, 2l);
//        System.out.println("Deleted: " + deleteC.toString());


    }
}
