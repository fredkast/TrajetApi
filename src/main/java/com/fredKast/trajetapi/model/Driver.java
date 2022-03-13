package com.fredKast.trajetapi.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "drivers")  // Customiz of Table name

public class Driver {
    // Table fields edit
    // Auto increment of ID
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    private String firstname;

    // private String vector;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "vector_id", nullable = false)
    private Vector vector;

    public Driver(){ 

     }

    public Driver(long id, String name, String firstname, Vector vector){
        this.id = id;
        this.name = name;
        this.firstname = firstname;
        this.vector = vector;
    }
    public long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstname(){
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public Vector getVector(){
        return vector;
    }

    public void setVector(Vector vector) {
        this.vector = vector;
    }
}