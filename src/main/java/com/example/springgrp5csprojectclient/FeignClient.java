package com.example.springgrp5csprojectclient;

import com.example.springgrp5csprojectclient.models.Category;
import com.example.springgrp5csprojectclient.models.Movie;
import com.example.springgrp5csprojectclient.models.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@org.springframework.cloud.openfeign.FeignClient(name = "client", url = "http://127.0.0.1:9000")
@org.springframework.cloud.openfeign.FeignClient(name = "client", url = "http://:9000")
public interface FeignClient {

    // 1. MOVIES

    // GET

    // List all movies
    @RequestMapping(method = RequestMethod.GET, value = "movies")
    List<Movie> getAllMovies();

    // Get All movies in a particular category and owned by the user(Type = suggested)
    @RequestMapping(method = RequestMethod.GET, value = "movies/{categoryId}")
    List<Movie> findMovies(@RequestParam(name = "type") String type, @PathVariable(name = "categoryId") Long categoryId);

    // Get the Release Date of the Movie with the movie's name
    @RequestMapping(method = RequestMethod.GET, value = "movies/movieRelease/{movieName}")
    Movie getReleaseDate(@PathVariable(name = "movieName") String Name);

    // Get all Movies that have been Suggested
    @RequestMapping(method = RequestMethod.GET, value = "movies/suggested_movies")
    List<Movie> getSuggestedMovies();

    // Get all liked movies
    @RequestMapping(method = RequestMethod.GET, value = "movies/liked_movies")
    List<Movie> getLikedMovies();

    // Get all users who suggested a movie
    @RequestMapping(method = RequestMethod.GET, value = "movies/users_who_suggested/{movieId}")
    List<User> usersWhoSuggested(@PathVariable(name = "movieId") Long movieId);

    // Get all users who liked a movie
    @RequestMapping(method = RequestMethod.GET, value = "movies/{movieId}")
    List<User> getLikes(@PathVariable(name = "movieId") Long movieId);

    // List User's Favourite Movies
    @RequestMapping(method = RequestMethod.GET, value = "{id}/favourite_movies")
    List<Movie> getFavorites(@PathVariable(name = "idNumber") Long idNumber);

    // POST

    // Post Original / Suggested Movie
    @RequestMapping(method = RequestMethod.POST, value = "movies/{idNumber}")
    Movie postMovie(@PathVariable(name = "idNumber") Long idNumber, @RequestBody Movie movie);

    // Approve Suggested Movie
    @RequestMapping(method = RequestMethod.POST, value = "movies/{idNumber}")
    Movie approveSuggestedMovie(@PathVariable(name = "idNumber") Long idNumber, @PathVariable(name = "movieId") Long movieId);

    // PATCH

    // Update Original / Suggested Movie
    @RequestMapping(method = RequestMethod.PATCH, value = "movies/idNumber/{movieId}")
    Movie updateMovie(@PathVariable(name = "idNumber") Long idNumber, @PathVariable(name = "movieId") Long movieId, @RequestBody Movie movie);

    // DELETE

    // Deleting a movie
    @RequestMapping(method = RequestMethod.DELETE, value = "movies/{idNumber}/{movieId}")
    Movie deleteMovie(@PathVariable(name = "idNumber") Long idNumber, @PathVariable(name = "movieId") Long movieId);





    // 2. USERS

    // GET

    // Find all users
    @RequestMapping(method = RequestMethod.GET, value = "users")
    List<User> getAllUsers();

    // View One User
    @RequestMapping(method = RequestMethod.GET, value = "users/{idNumber}")
    User getOneUser(@PathVariable(name = "idNumber") Long idNumber);

    // List all Movies that User has Suggested ****
    // TODO: Confirm whether this will use the new model
    @RequestMapping(method = RequestMethod.GET, value = "users/{idNumber}")
    User getSuggestedMovies(@PathVariable(name = "idNumber") Long idNumber);

    // POST

    // Create account: Register
    @RequestMapping(method = RequestMethod.POST, value = "users")
    User createUser(@RequestBody User user);

    // User adds a movie to Favourites list
    @RequestMapping(method = RequestMethod.POST, value = "users/{idNumber}/movie_favourite")
    Movie addFavorite(@PathVariable(name = "idNumber") Long idNumber, @RequestParam(name = "movieId") Long movieId);

    // PATCH

    // Update User
    @RequestMapping(method = RequestMethod.PATCH, value = "users/{idNumber}")
    User updateUser(@RequestParam(name = "idNumber") Long idNumber, @RequestBody User user);

    // DELETE

    // Delete the account
    @RequestMapping(method = RequestMethod.DELETE, value = "users/idNumber")
    User deleteUser(@PathVariable(name = "idNumber") Long idNumber);





    // 3. CATEGORIES

    // GET

    // List all categories
    @RequestMapping(method = RequestMethod.GET, value = "categories")
    List<Category> getAllCategories();

    // POST

    // Create a Category
    @RequestMapping(method = RequestMethod.POST, value = "users/{idNumber}/categories")
    Category createCategory(@PathVariable(name = "idNumber") Long idNumber, @RequestBody Category category);

    // PATCH

    // Update a Category
    @RequestMapping(method = RequestMethod.PATCH, value = "users/{idNumber}/categories")
    Category updateCategory(@PathVariable(name = "idNumber") Long idNumber, @RequestBody Category category);

    // DELETE

    // Delete a Category
    @RequestMapping(method = RequestMethod.DELETE, value = "users/{idNumber}/{categoryId}categories")
    Category deleteCategory(@PathVariable(name = "idNumber") Long idNumber, @PathVariable(name = "categoryId") Long categoryId);

}
