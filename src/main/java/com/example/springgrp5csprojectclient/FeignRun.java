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

        // List all movies
        List<Movie> allMovies = feignClient.getAllMovies();
        System.out.println("All Movies: " + allMovies.toString());

        // Find one movie
        Movie getOne = feignClient.getOneMovie(1L);
        System.out.println("Movie found " + getOne.toString());

        // Get All movies in a particular category and owned by the user(Type = suggested)
        List<Movie> ownedMovies = feignClient.findMovies("suggested", 5L);
        System.out.println("Your movies: " + ownedMovies.toString());

        // Get the Release Date of the Movie with the movie's name
        Movie releaseDate = feignClient.getReleaseDate(1L);
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

        // POST

        // Suggest a movie
        Movie suggestM = feignClient.postMovie(11L, new Movie("Transformers", "2014"));
        System.out.println("You've suggested: " + suggestM.toString());

        // PATCH

        // Update movie details
        Movie updateM = feignClient.updateMovie(1L, 1L, new Movie("Shrek 2"));
        System.out.println("Update successful: " + updateM.toString());

        // DELETE

        // Delete a movie
        Movie deleteM = feignClient.deleteMovie(1L, 1L);
        System.out.println("Delete Successful: " + deleteM.toString());


        // 2. Users

        // GET

        // Find all users
        List<User> getAllUsers = feignClient.getAllUsers();
        System.out.println("Users " + getAllUsers.toString());

        // View One User
        User getOneUser = feignClient.getOneUser(1L);
        System.out.println("Found user " + getOneUser.toString());

        // List all Movies that User has Suggested ****
        List<Movie> getSuggested = feignClient.getSuggestedMovies(22L);
        System.out.println("Movies suggested: " + getSuggested.toString());

        // List User's Favourite Movies
        List<Movie> getFavorites = feignClient.getFavorites(22L);
        System.out.println("Favorites: " + getFavorites.toString());

        // POST

        // Create account: Register
        User createU = feignClient.createUser(new User("Jane Doe", 1234L));
        System.out.println("Account created: " + createU.toString());

        // User adds a movie to Favourites list
        Movie addFavoriteMovie = feignClient.addFavorite(22l, 5l);
        System.out.println("Movie added to favorites: " + addFavoriteMovie.toString());

        // PATCH

        // Update User
        User updateU = feignClient.updateUser(22L, new User("Jane two", 22l));
        System.out.println("Updated user details: " + updateU.toString());

        // DELETE

        // Delete user
        User deleteU = feignClient.deleteUser(22l,1234l);
        System.out.println("Account deleted: " + deleteU.toString());


        // 3. Categories

        // GET

        // List all categories
        List<Category> getAllCategories = feignClient.getAllCategories();
        System.out.println("Categories: " + getAllCategories.toString());

        // Pick one category
        Category getOneCategory = feignClient.getOneCategory(1l);
        System.out.println("Single category: " + getOneCategory.toString());

        // POST

        // Create a Category
        Category createC = feignClient.createCategory(22l, new Category(22l, "Thriller"));
        System.out.println("Created catefory: " + createC.toString());

        // PATCH

        // Update a Category
        Category updateC = feignClient.updateCategory(22l,2l, new Category(2l, "Thriller main"));
        System.out.println("Updated: " + updateC);

        // DELETE

        // Delete a Category
        Category deleteC = feignClient.deleteCategory(22l, 2l);
        System.out.println("Deleted: " + deleteC.toString());


    }
}
