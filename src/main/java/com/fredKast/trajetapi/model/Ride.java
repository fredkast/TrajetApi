package com.fredKast.trajetapi.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "rides")  // Customiz of Table name

public class Ride {
    // Table fields edit
    // Auto increment of ID
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String trip;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "driver_id", nullable = false)
    private Driver driver;

    public Ride(){ 

     }

    public Ride(long id, String trip, Driver driver){
        this.id = id;
        this.trip = trip;
        this.driver = driver;
    }
    public long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getTrip() {
        return trip;
    }

    public void setTrip(String trip) {
        this.trip = trip;
    }

    public Driver getDriver(){
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}