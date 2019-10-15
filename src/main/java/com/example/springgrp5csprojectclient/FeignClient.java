package com.example.springgrp5csprojectclient;

import com.example.springgrp5csprojectclient.models.Category;
import com.example.springgrp5csprojectclient.models.Movie;
import com.example.springgrp5csprojectclient.models.Type;
import com.example.springgrp5csprojectclient.models.User;
import org.graalvm.compiler.asm.sparc.SPARCAssembler;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@org.springframework.cloud.openfeign.FeignClient(name = "client", url = "http://127.0.0.1:9000")
public interface FeignClient {

    // 1. Movies

    // List all movies
    @RequestMapping(method = RequestMethod.GET, value = "movies")
    List<Movie> findAllMovies();

    // Pick one movie
    @RequestMapping(method = RequestMethod.GET, value = "movies/{movieId}")
    Movie findOneMovie(@PathVariable(name = "movieId") Long movieId);

    // Get All movies in a particular category and owned by the user(Type = suggested)
    @RequestMapping(method = RequestMethod.GET, value = "movies/{categoryId}")
    List<Movie> findMovies(@RequestParam(name = "type") Type type, @PathVariable(name = "categoryId") Long categoryId);

    // Suggest a movie
    @RequestMapping(method = RequestMethod.POST, value = "movies")
    Movie suggestMovie(@RequestBody Movie movie);

    // Update movie details
    @RequestMapping(method = RequestMethod.PATCH, value = "movies/movieId")
    Movie updateMovie(@RequestParam(name = "userId") Long userId, @PathVariable(name = "movieId") Long movieId, @RequestBody Movie movie);

    // Deleting a movie
    @RequestMapping(method = RequestMethod.DELETE, value = "movies/movieId")
    Movie deleteMovie(@RequestParam(name = "userId") Long userId, @PathVariable(name = "movieId") Long movieId);

    // 2. Users

    // Create account
    @RequestMapping(method = RequestMethod.POST, value = "users")
    User createUser(@RequestBody User user);

    // Delete the account
    @RequestMapping(method = RequestMethod.DELETE, value = "users/userId")
    User deleteUser(@PathVariable(name = "userId") Long userId);


    // 3. Categories
    @RequestMapping(method = RequestMethod.GET, value = "categories")
    Category findAllCategories(@PathVariable(name = "categoryId") Long categoryId);
}
