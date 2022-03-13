package com.fredKast.trajetapi.dto.model;

public class DriverDto {

    private String name;

    private  String firstname;

    private String vector;

    public DriverDto(String name, String firstname, String vector) {
        this.name = name;
        this.firstname = firstname;
        this.vector = vector;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getVector() {
        return vector;
    }

    public void setVector() {
        this.vector = vector;
    }


    
}
