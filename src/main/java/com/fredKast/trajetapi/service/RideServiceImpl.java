package com.fredKast.trajetapi.service;

import java.util.List;
import java.util.Optional;

import com.fredKast.trajetapi.dto.mapper.RideMapper;
import com.fredKast.trajetapi.dto.model.RideDto;
import com.fredKast.trajetapi.model.Ride;
import com.fredKast.trajetapi.repository.RideRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("rideService")
public class RideServiceImpl implements RideService{
    @Autowired 
    RideRepository rideRepository;
    
    @Override
    public Optional<Ride> get(long rideId) {
        return rideRepository.findById(rideId);
    }
    @Override
    public List<Ride> getAll() {
        return rideRepository.findAll();
    }
    @Override
    public Optional<Ride>  create(RideDto rideDto) {
        return Optional.of(rideRepository.save(RideMapper.toRide(rideDto)));
    }
    @Override
    public String delete(long rideId) {
        rideRepository.deleteById(rideId);
        return "Ride deleted with success";
    }
    @Override
    public Optional<Ride> update(Ride existingRideToUpdate, RideDto rideDtoWithUpdate) {
         // -- Update existing user informations
         existingRideToUpdate.setTrip(rideDtoWithUpdate.getTrip());
        //  existingRideToUpdate.setDriver(rideDtoWithUpdate.getDriver());
 
         // -- Update existing user in DB with new informations
         Optional<Ride> updateRide = Optional.of(rideRepository.save(existingRideToUpdate));
 
         return updateRide;
    }
    
}
