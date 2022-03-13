package com.fredKast.trajetapi.service;

import java.util.List;
import java.util.Optional;

import com.fredKast.trajetapi.dto.model.DriverDto;
import com.fredKast.trajetapi.model.Driver;

public interface DriverService {
    
     /**
     * 
     * @param driverId
     * @return driver find by id
     */
    public Optional<Driver> get(long driverId);

    /**
     * Get list of Driver
     *
     * @return list of Driver
     */
    public List<Driver> getAll();

     /**
     * Create a new Driver
     *
     * @param driverDto to create
     * @return a new Driver created
     */
    public Optional<Driver> create(DriverDto driverDto);

    /**
     * Delete Driver by id
     *
     * @param driverId  Driver identifiant
     * @return delete Driver by id
     */
    public String delete(long driverId);

    /**
     * Update a existing Driver
     *
     * @param existingDriverToUpdate existing Driver object
     * @param driverDtoWithUpdate Driver dto with informations to update
     * @return Driver updated
     */
    public Optional<Driver> update(Driver existingDriverToUpdate,DriverDto driverDtoWithUpdate);
}
