package com.fredKast.trajetapi.dto.mapper;
 
// import java.util.Date;

import com.fredKast.trajetapi.dto.model.RideDto;

import com.fredKast.trajetapi.model.Ride;

public class RideMapper {
    
    public static Ride toRide(RideDto rideDto){
        Ride ride = new Ride();
        // ride.setDate(new Date());
        ride.setTrip(rideDto.getTrip());
        ride.setRange(rideDto.getRange());
        ride.setAverageSpeed(rideDto.getAverageSpeed());
        ride.setConsumption(rideDto.getConsumption());

        return ride;
    }
}
