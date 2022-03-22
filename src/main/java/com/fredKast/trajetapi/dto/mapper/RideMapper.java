package com.fredKast.trajetapi.dto.mapper;
 
import com.fredKast.trajetapi.dto.model.RideDto;

import com.fredKast.trajetapi.model.Ride;

public class RideMapper {
    
    public static Ride toRide(RideDto rideDto){
        Ride ride = new Ride();
        ride.setTrip(rideDto.getTrip());
        // ride.setDriver(rideDto.getDriver());
        return ride;
    }
}
