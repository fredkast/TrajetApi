package com.fredKast.trajetapi.model;

import javax.persistence.*;

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

    // private Date createdAt;
    private String vector;

    // @Enumerated(EnumType.STRING)
    // private VectorType vector;

    public Driver(){  }

    public Driver(long id, String name, String firstname, String vector){
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

    public String getVector(){
        return vector;
    }

    public void setVector(String vector) {
        this.vector = vector;
    }
}