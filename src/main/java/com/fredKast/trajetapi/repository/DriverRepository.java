package com.fredKast.trajetapi.repository;

import com.fredKast.trajetapi.model.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Long>{
    
}


