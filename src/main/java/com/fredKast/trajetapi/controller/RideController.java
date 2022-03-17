package com.fredKast.trajetapi.controller;

import com.fredKast.trajetapi.dto.model.RideDto;
import com.fredKast.trajetapi.model.Ride;
import com.fredKast.trajetapi.service.RideService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

// API request handler for Rides
@RestController
@RequestMapping("/rides")
public class RideController {
    @Resource(name = "rideService")
    private RideService rideService;

    @GetMapping("/{id}") // HTTP request GET + /ride/id
    public Ride get(@PathVariable long id) {
        return rideService.get(id).orElseThrow(() -> new RuntimeException("Ride not found : " + id));
    }

    @GetMapping //HTTP request GET + /rides/
    public List<Ride> getAll() {
        
        return rideService.getAll();
        
    }
    @PostMapping // HTTP request POST + /rides/
    public Ride create(final @RequestBody RideDto ride){
        return rideService.create(ride).orElseThrow(() -> new RuntimeException("Something went wrong, please try later"));
    }

    @PutMapping("/{id}") 
    public Ride update(@PathVariable long id, final @RequestBody RideDto rideDtoWithUpdate) {
        Optional<Ride> existingRideToUpdate = Optional.ofNullable(rideService.get(id).orElseThrow(() -> new RuntimeException("Ride not found : " + id)));

        return rideService.update(existingRideToUpdate.get(), rideDtoWithUpdate)
                .orElseThrow(() -> new RuntimeException("Something went wrong, please try later"));
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable long id) {
        return rideService.delete(id);
    }
}
