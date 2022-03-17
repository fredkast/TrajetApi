package com.fredKast.trajetapi.repository;

import com.fredKast.trajetapi.model.Ride;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RideRepository extends JpaRepository<Ride, Long>{
    
}


