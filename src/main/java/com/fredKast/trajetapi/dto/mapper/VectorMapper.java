package com.fredKast.trajetapi.dto.mapper;
 
import com.fredKast.trajetapi.dto.model.VectorDto;

import com.fredKast.trajetapi.model.Vector;

public class VectorMapper {
    
    public static Vector toVector(VectorDto vectorDto){
        Vector vector = new Vector();
        vector.setName(vectorDto.getName());

        return vector;
    }
}
