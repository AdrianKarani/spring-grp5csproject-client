package com.example.springgrp5csprojectclient.models;

public class User {

    private String name;
    private Long idNumber;
    private Long id;

    public User() {
    }

    public User(String name, Long idNumber) {
        this.idNumber = idNumber;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(Long idNumber) {
        this.idNumber = idNumber;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", idNumber=" + idNumber +
                ", id=" + id +
                '}';
    }
}
