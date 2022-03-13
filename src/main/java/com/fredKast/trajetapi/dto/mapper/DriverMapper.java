package com.fredKast.trajetapi.dto.mapper;
 
import com.fredKast.trajetapi.dto.model.DriverDto;

import com.fredKast.trajetapi.model.Driver;

public class DriverMapper {
    
    public static Driver toDriver(DriverDto driverDto){
        Driver driver = new Driver();
        driver.setName(driverDto.getName());
        driver.setFirstname(driverDto.getFirstname());
        driver.setVector(driverDto.getVector());
        return driver;
    }
}
