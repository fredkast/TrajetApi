package com.fredKast.trajetapi.service;

import java.util.List;
import java.util.Optional;

import com.fredKast.trajetapi.dto.model.VectorDto;
import com.fredKast.trajetapi.model.Vector;

public interface VectorService {
    
     /**
     * 
     * @param vectorId
     * @return Vector find by id
     */
    public Optional<Vector> get(long vectorId);

    /**
     * Get list of Vector
     *
     * @return list of Vector
     */
    public List<Vector> getAll();

     /**
     * Create a new Vector
     *
     * @param vectorDto to create
     * @return a new Vector created
     */
    public Optional<Vector> create(VectorDto vectorDto);

    /**
     * Delete Vector by id
     *
     * @param vectorId  Vector identifiant
     * @return delete Vector by id
     */
    public String delete(long vectorId);

    /**
     * Update a existing Vector
     *
     * @param existingVectorToUpdate existing Vector object
     * @param vectorDtoWithUpdate Vector dto with informations to update
     * @return Vector updated
     */
    public Optional<Vector> update(Vector existingVectorToUpdate,VectorDto vectorDtoWithUpdate);
}
