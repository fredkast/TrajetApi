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

    private String rideStyle;

    private String start;

    private String arrival;

    private String range;

    private String averageSpeed;

    private String consumption;

    private String duration;

    public Ride(){

    }
}
