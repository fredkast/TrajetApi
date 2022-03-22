package com.fredKast.trajetapi.dto.model;

public class RideDto {

    private String trip;

    private String driver;

    public RideDto(String trip, String driver) {
        this.trip = trip;
        this.driver = driver;
    }

    public String getTrip() {
        return trip;
    }

    public void setTrip(String trip) {
        this.trip = trip;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver() {
        this.driver = driver;
    }


    
}
