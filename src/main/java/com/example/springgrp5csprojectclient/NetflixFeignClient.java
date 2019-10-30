package com.example.springgrp5csprojectclient;

import com.example.springgrp5csprojectclient.models.Category;
import com.example.springgrp5csprojectclient.models.Movie;
import com.example.springgrp5csprojectclient.models.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "client", url = "http://127.0.0.1:5555")
public interface NetflixFeignClient {

    // 1. MOVIES

    // GET

    // List all movies
    @RequestMapping(method = RequestMethod.GET, value = "movies")
    List<Movie> getAllMovies();

    // Find one movie
    @RequestMapping(method = RequestMethod.GET, value = "movies/{id}")
    Movie findMovie(@PathVariable(name = "id") Long id);

    // Get All movies in a particular category and owned by the user(Type = suggested)
    @RequestMapping(method = RequestMethod.GET, value = "movies/available/{categoryId}")
    List<Movie> findMovies(@RequestParam(name = "type") String type, @PathVariable(name = "categoryId") Long categoryId);

    // Get the Release Date of the Movie with the movie's Id
    @RequestMapping(method = RequestMethod.GET, value = "movies/{movieId}/release_date")
    String getReleaseDate(@PathVariable(name = "movieId") Long movieId);

    // Get all Movies that have been Suggested
    @RequestMapping(method = RequestMethod.GET, value = "movies/suggested")
    List<Movie> getSuggestedMovies();

    // Get all liked movies
    @RequestMapping(method = RequestMethod.GET, value = "movies/liked")
    List<Movie> getLikedMovies();

    // Get all users who suggested a movie
    @RequestMapping(method = RequestMethod.GET, value = "movies/suggested/{movieId}/users")
    List<User> usersWhoSuggested(@PathVariable(name = "movieId") Long movieId);

    // Get all users who liked a movie
    @RequestMapping(method = RequestMethod.GET, value = "movies/liked/{id}/users")
    List<User> getLikes(@PathVariable(name = "id") Long movieId);

    // POST

    // Post Original / Suggested Movie
    @RequestMapping(method = RequestMethod.POST, value = "users/{id}/movies")
    Movie postMovie(@PathVariable(name = "id") Long id, @RequestBody Movie movie);

    // Approve Suggested Movie
    @RequestMapping(method = RequestMethod.POST, value = "users/{id}/movies/suggested/{movieId}")
    Movie approveSuggestedMovie(@PathVariable(name = "id") Long id, @PathVariable(name = "movieId") Long movieId);

    // PATCH

    // Update Original / Suggested Movie
    @RequestMapping(method = RequestMethod.PUT, value = "users/{id}/movies/{movieId}")
    Movie updateMovie(@PathVariable(name = "id") Long id, @PathVariable(name = "movieId") Long movieId, @RequestBody Movie movie);

    // DELETE

    // Deleting a movie
    @RequestMapping(method = RequestMethod.DELETE, value = "users/{userId}/movies/{movieId}")
    Movie deleteMovie(@PathVariable(name = "idNumber") Long idNumber, @PathVariable(name = "movieId") Long movieId);


    // 2. USERS

    // GET

    // Find all users
    @RequestMapping(method = RequestMethod.GET, value = "users")
    List<User> getAllUsers();

    // View One User
    @RequestMapping(method = RequestMethod.GET, value = "users/{id}")
    User getOneUser(@PathVariable(name = "id") Long id);

    // List all Movies that User has Suggested ****
    @RequestMapping(method = RequestMethod.GET, value = "users/{id}/movies/suggested")
    List<Movie> getSuggestedMovies(@PathVariable(name = "id") Long id);

    // List User's Favourite Movies
    @RequestMapping(method = RequestMethod.GET, value = "users/{id}/movies/liked")
    List<Movie> getFavorites(@PathVariable(name = "id") Long id);


    // POST

    // Create account: Register
    @RequestMapping(method = RequestMethod.POST, value = "users")
    User createUser(@RequestBody User user);

    // User adds a movie to Favourites list
    @RequestMapping(method = RequestMethod.POST, value = "users/{id}/movies/like")
    Movie addFavorite(@PathVariable(name = "id") Long id, @RequestParam(name = "movieId") Long movieId);

    // PATCH

    // Update User
    @RequestMapping(method = RequestMethod.PUT, value = "users/{id}")
    User updateUser(@PathVariable(name = "id") Long id, @RequestBody User user);

    // DELETE

    // Delete the account
    @RequestMapping(method = RequestMethod.DELETE, value = "users/{id}/idnumber/{idNumber}")
    User deleteUser(@PathVariable(name = "id") Long id, @PathVariable(name = "idNumber") Long idNumber);


    // 3. CATEGORIES

    // GET

    // List all categories
    @RequestMapping(method = RequestMethod.GET, value = "categories")
    List<Category> getAllCategories();

    // Pick one category
    @RequestMapping(method = RequestMethod.GET, value = "categories/{id}")
    Category getOneCategory(@PathVariable(name = "id") Long id);

    // POST

    // Create a Category
    @RequestMapping(method = RequestMethod.POST, value = "users/{id}/category")
    Category createCategory(@PathVariable(name = "id") Long id, @RequestBody Category category);

    // PATCH

    // Update a Category
    @RequestMapping(method = RequestMethod.PATCH, value = "users/{id}/category/{categoryId}")
    Category updateCategory(@PathVariable(name = "id") Long id, @PathVariable(name = "categoryId") Long categoryId, @RequestBody Category category);

    // DELETE

    // Delete a Category
    @RequestMapping(method = RequestMethod.DELETE, value = "users/{id}/category/{categoryId}")
    Category deleteCategory(@PathVariable(name = "id") Long id, @PathVariable(name = "categoryId") Long categoryId);

}
