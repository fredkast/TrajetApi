package com.fredKast.trajetapi.dto.model;

import java.sql.Date;

import com.fredKast.trajetapi.model.Driver;
import com.fredKast.trajetapi.model.Trip;

public class RideDto {

    private Date date;

    private String range;

    private Trip trip;

    private String averageSpeed;

    private String consumption;

    private long id;

    Driver driver;

    public RideDto(long id, Driver driver, Date date, Trip trip, String range, String averageSpeed, String consumption){
        this.id = id;
        this.driver = driver;
        this.date = date;
        this.trip = trip;
        this.range = range;
        this.averageSpeed = averageSpeed;
        this.consumption = consumption;
    }

    public long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Trip getTrip(){
        return trip;
    }

    public void setTrip(Trip trip) {
        this.trip = trip;
    }

    public String getRange(){
        return range;
    }

    public void setRange(String vector) {
        this.range = vector;
    }
    
    public String getAverageSpeed(){
        return averageSpeed;
    }

    public void setAverageSpeed(String averageSpeed) {
        this.averageSpeed = averageSpeed;
    }

    public String getConsumption(){
        return consumption;
    }

    public void setConsumption(String consumption) {
        this.consumption = consumption;
    }

    
}
