package com.fredKast.trajetapi.controller;

import com.fredKast.trajetapi.dto.model.DriverDto;
import com.fredKast.trajetapi.model.Driver;
import com.fredKast.trajetapi.service.DriverService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

// API request handler for DRIVERS
@RestController
@RequestMapping("/drivers")
public class DriverController {
    @Resource(name = "driverService")
    private DriverService driverService;

    @GetMapping("/{id}") // HTTP request GET + /driver/id
    public Driver get(@PathVariable long id) {
        return driverService.get(id).orElseThrow(() -> new RuntimeException("Driver not found : " + id));
    }

    @GetMapping //HTTP request GET + /drivers/
    public List<Driver> getAll() {
        
        return driverService.getAll();
        
    }
    @PostMapping // HTTP request POST + /drivers/
    public Driver create(final @RequestBody DriverDto driver){
        return driverService.create(driver).orElseThrow(() -> new RuntimeException("Something went wrong, please try later"));
    }

    @PutMapping("/{id}") 
    public Driver update(@PathVariable long id, final @RequestBody DriverDto driverDtoWithUpdate) {
        Optional<Driver> existingDriverToUpdate = Optional.ofNullable(driverService.get(id).orElseThrow(() -> new RuntimeException("Driver not found : " + id)));

        return driverService.update(existingDriverToUpdate.get(), driverDtoWithUpdate)
                .orElseThrow(() -> new RuntimeException("Something went wrong, please try later"));
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable long id) {
        return driverService.delete(id);
    }
}
