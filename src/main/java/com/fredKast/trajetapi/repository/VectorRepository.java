package com.fredKast.trajetapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.fredKast.trajetapi.model.Vector;

@Repository
public interface VectorRepository extends JpaRepository<Vector, Long>{
    
}


