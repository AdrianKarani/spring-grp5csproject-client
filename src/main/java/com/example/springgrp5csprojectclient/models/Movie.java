package com.example.springgrp5csprojectclient.models;

import java.util.HashSet;
import java.util.Set;

public class Movie {

    private Long id;
    private String name;
    private String releaseDate;
    private Set<Category> categories;

    // Empty Constructor
    public Movie() {
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

    public void setCategory(Category category) {
        if (this.categories == null) {
            System.out.println("Adding a Category to empty set");
            this.categories = new HashSet<Category>() {{ add(category); }};
        } else {
            System.out.println("Adding a Category to existing set");
            this.categories.add(category);
        }
    }

    public Set<Category> getCategories() {
        return categories;
    }

    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", categories='" + categories + '\'' +
                '}';
    }
}
