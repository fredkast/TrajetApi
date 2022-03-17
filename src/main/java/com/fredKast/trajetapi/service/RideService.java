package com.fredKast.trajetapi.service;

import java.util.List;
import java.util.Optional;

import com.fredKast.trajetapi.dto.model.RideDto;
import com.fredKast.trajetapi.model.Ride;

public interface RideService {
    
     /**
     * 
     * @param rideId
     * @return ride find by id
     */
    public Optional<Ride> get(long rideId);

    /**
     * Get list of Ride
     *
     * @return list of Ride
     */
    public List<Ride> getAll();

     /**
     * Create a new Ride
     *
     * @param rideDto to create
     * @return a new Ride created
     */
    public Optional<Ride> create(RideDto rideDto);

    /**
     * Delete Ride by id
     *
     * @param rideId  Ride identifiant
     * @return delete Ride by id
     */
    public String delete(long rideId);

    /**
     * Update a existing Ride
     *
     * @param existingRideToUpdate existing Ride object
     * @param rideDtoWithUpdate Ride dto with informations to update
     * @return Ride updated
     */
    public Optional<Ride> update(Ride existingRideToUpdate,RideDto rideDtoWithUpdate);
}
