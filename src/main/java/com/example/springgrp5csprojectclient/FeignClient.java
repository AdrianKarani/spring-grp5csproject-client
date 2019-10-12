package com.example.springgrp5csprojectclient;

import com.example.springgrp5csprojectclient.models.Movie;
import com.example.springgrp5csprojectclient.models.User;
import org.graalvm.compiler.asm.sparc.SPARCAssembler;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@org.springframework.cloud.openfeign.FeignClient(name = "client", url = "")
public interface FeignClient {

    // 1. Movies

    // Get All movies
    @RequestMapping(method = RequestMethod.GET, value = "movies/{categoryId}")
    List<Movie> findMovies(@RequestParam(name = "type") String type, @PathVariable(name = "categoryId") Long categoryId);

    // Get one movie
//    @RequestMapping(method = RequestMethod.GET, value = "movies/{categoryId}")
//    List<Movie> findMovies(@RequestParam(name = "type") String type, @PathVariable(name = "categoryId") Long categoryId);

    // Suggest a movie
    @RequestMapping(method = RequestMethod.POST, value = "movies")
    Movie suggestMovie(@RequestBody Movie movie);

    // Update movie details
    @RequestMapping(method = RequestMethod.PATCH, value = "movies/movieId")
    Movie updateMovie(@RequestParam(name = "userId") Long userId, @PathVariable(name = "movieId") Long movieId);

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

}
