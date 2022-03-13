package com.fredKast.trajetapi.service;

import java.util.List;
import java.util.Optional;

import com.fredKast.trajetapi.dto.mapper.DriverMapper;
import com.fredKast.trajetapi.dto.model.DriverDto;
import com.fredKast.trajetapi.model.Driver;
import com.fredKast.trajetapi.repository.DriverRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("driverService")
public class DriverServiceImpl implements DriverService{
    @Autowired 
    DriverRepository driverRepository;
    
    @Override
    public Optional<Driver> get(long driverId) {
        return driverRepository.findById(driverId);
    }
    @Override
    public List<Driver> getAll() {
        return driverRepository.findAll();
    }
    @Override
    public Optional<Driver>  create(DriverDto driverDto) {
        return Optional.of(driverRepository.save(DriverMapper.toDriver(driverDto)));
    }
    @Override
    public String delete(long driverId) {
        driverRepository.deleteById(driverId);
        return "Driver deleted with success";
    }
    @Override
    public Optional<Driver> update(Driver existingDriverToUpdate, DriverDto driverDtoWithUpdate) {
         // -- Update existing user informations
         existingDriverToUpdate.setName(driverDtoWithUpdate.getName());
         existingDriverToUpdate.setFirstname(driverDtoWithUpdate.getFirstname());
         existingDriverToUpdate.setVector(driverDtoWithUpdate.getVector());
 
         // -- Update existing user in DB with new informations
         Optional<Driver> updateDriver = Optional.of(driverRepository.save(existingDriverToUpdate));
 
         return updateDriver;
    }
    
}
