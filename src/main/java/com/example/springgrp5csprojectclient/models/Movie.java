package com.example.springgrp5csprojectclient.models;

public class Movie {

    private Long id;
    private String name;
    private String releaseDate;

    // Empty Constructor
    public Movie(){
    }

    public Movie(String name) {
        this.name = name;
    }


    public Movie(String name, String releaseDate) {
        this.name = name;
        this.releaseDate = releaseDate;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                '}';
    }
}
