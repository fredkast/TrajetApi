package com.fredKast.trajetapi.model;

import java.sql.Date;

import javax.persistence.*;

import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "rides")  // Customiz of Table name

public class Ride {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "driver_id", nullable = false)
    private Driver driver;

    private Date date;

    @Enumerated(EnumType.STRING) 
    private Trip trip;

    private String range;

    private String averageSpeed;

    private String consumption;

    public Ride(){

    }
    public Ride(long id,Driver driver, Date date, Trip trip, String range, String averageSpeed, String consumption){
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
