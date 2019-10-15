package com.example.springgrp5csprojectclient.models;

public class Movie {

    private Long id;
    private String name;
    private Type type;

    // Empty Constructor
    public Movie(){
    }

    public Movie(String name) {
        this.name = name;
    }

    public Movie(String name, Type type) {
        this.name = name;
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
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

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
