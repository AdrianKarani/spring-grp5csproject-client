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
        try {

            // GET
//    //DONE->// List all movies
//            List<Movie> allMovies = feignClient.getAllMovies();
//            System.out.println("All Movies: " + allMovies.toString());
//
//    //DONE->// Find one movie
//            Movie getOne = feignClient.getOneMovie(16L);
//            System.out.println("Movie found " + getOne.toString());
//
//    //DONE->// Get All movies in a particular category and owned by the user(Type = suggested)
//            List<Movie> ownedMovies = feignClient.findMovies("ORIGINAL", 9L);
//            System.out.println("Your movies: " + ownedMovies.toString());
//
//    //DONE->// Get the Release Date of the Movie with the movie's id
//            String releaseDate = feignClient.getReleaseDate(16L);
//            System.out.println("Release Date : " + releaseDate);
//
//    //DONE->// Get all pending suggested movies
//            List<Movie> pendingSuggestedMovies = feignClient.getPendingSuggestedMovies();
//            System.out.println("Suggested Movies pending approval: " + pendingSuggestedMovies.toString());
//
//    //DONE->// Get all approved suggested movies
//            List<Movie> approvedSuggestedMovies = feignClient.getApprovedSuggestedMovies();
//            System.out.println("Suggested Movies that have been approved: " + approvedSuggestedMovies.toString());
//
//    //DONE->// Get all liked movies
//            List<Movie> likedMovies = feignClient.getLikedMovies();
//            System.out.println("Liked Movies: " + likedMovies.toString());
//
//    //DONE->// Get all users who suggested a movie
//            List<User> suggestion = feignClient.usersWhoSuggested(20L);
//            System.out.println("Users who suggested the movie given: " + suggestion.toString());
//
//    //DONE->// Get all users who liked a movie
//            List<User> likes = feignClient.getLikes(36L);
//            System.out.println("Users who liked the movie given: " + likes.toString());
//
//    //DONE->// List a user's Favourite Movies
//            List<Movie> favorites = feignClient.getFavorites(41L);
//            System.out.println("Your favorites: " + favorites.toString());

            // POST

//    //DONE->// Suggest a movie
//            Movie suggestM = feignClient.postMovie(41L, new Movie("Baby Driver", "2018"));
//            System.out.println("You've suggested: " + suggestM.toString());
//
//    //DONE->// Approve Suggested Movie - Admin only
//            Movie approveM = feignClient.approveSuggestedMovie(10l, 44l);
//            System.out.println("Movie approved " + approveM.toString());


            // PATCH

//    //DONE->// Update movie details
//            Movie findForUpdate = feignClient.getOneMovie(16l);
//            findForUpdate.setName("Batman and Joker");
//            findForUpdate.setReleaseDate("2099");
//            Movie updateM = feignClient.updateMovie(10L, findForUpdate.getId(), findForUpdate);
//            System.out.println("Update successful: " + updateM.toString());

            // DELETE

//    //DONE->// Delete a movie
//            Movie deleteM = feignClient.deleteMovie(10L, 16L);
//            System.out.println("Delete Successful");


            // 2. Users

            // GET

//    //DONE->// Find all users
//            List<User> getAllUsers = feignClient.getAllUsers();
//            System.out.println("Users " + getAllUsers.toString());
//
//    //DONE->// View One User
//            User getOneUser = feignClient.getOneUser(21L);
//            System.out.println("Found user " + getOneUser.toString());
//
//    //DONE->// List all Movies that a user has Suggested
//            List<Movie> getSuggested = feignClient.getSuggestedMovies(41L);
//            System.out.println("Movies suggested: " + getSuggested.toString());

            // POST

//    //DONE->// Create account: Register
//            User createU = feignClient.createUser(new User("Jane Doe", 1234L));
//            System.out.println("Account created: " + createU.toString());
//
//    //DONE->// User adds a movie to Favourites list
//            Movie findForFavoriteM = feignClient.getOneMovie(49l);
//            User findForFavoriteU = feignClient.getOneUser(41l);
//            Movie addFavoriteMovie = feignClient.addFavorite(findForFavoriteU.getId(), findForFavoriteM.getId());
//            System.out.println("Movie added to favorites: " + addFavoriteMovie.toString());

            // PATCH

//    //DONE->// Update User
//            User updateUserId = feignClient.getOneUser(21L);
//            updateUserId.setName("Jandad adda");
//            User updateU = feignClient.updateUser(updateUserId.getId(), updateUserId);
//            System.out.println("Updated user details: " + updateU.toString());

            // DELETE

//    //DONE->// Delete user
//            User deleteU = feignClient.deleteUser(21l, 1234l);
//            System.out.println("Account deleted");


            // 3. Categories

            // GET

//    //DONE->// List all categories
//            List<Category> getAllCategories = feignClient.getAllCategories();
//            System.out.println("Categories: " + getAllCategories.toString());
//
//    //DONE->// Pick one category
//            Category getOneCategory = feignClient.getOneCategory(1l);
//            System.out.println("Single category: " + getOneCategory.toString());

            // POST

//    //DONE->// Create a Category
//            Category createC = feignClient.createCategory(10l, new Category("Nonsense"));
//            System.out.println("Created category: " + createC.toString());

            // PATCH

//    //DONE->// Update a Category
//            Category findforUpdateC = feignClient.getOneCategory(50l);
//            findforUpdateC.setName("Even more nonsense");
//            Category updateC = feignClient.updateCategory(10l, findforUpdateC.getId(), findforUpdateC);
//            System.out.println("Updated: " + updateC.toString());

            // DELETE

//    //DONE->// Delete a Category
//            Category findforDeleteC = feignClient.getOneCategory(50l);
//            Category deleteC = feignClient.deleteCategory(10l, findforDeleteC.getId());
//            System.out.println("Category Deleted");

        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
