package com.example.springgrp5csprojectclient.models;

public class Movie {
    // TODO: Relationship to Type and Category

    private Long id;
    private String name;
    private String releaseDate;
//    private String type;

    // Empty Constructor
    public Movie(){

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

    public String getCategory() {
        return releaseDate;
    }

    public void setCategory(String category) {
        this.releaseDate = category;
    }

//    public String getType() {
//        return type;
//    }
//
//    public void setType(String type) {
//        this.type = type;
//    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + releaseDate + '\'' +
                '}';
    }
}
