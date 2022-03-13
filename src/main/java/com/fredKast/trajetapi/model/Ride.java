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
}
