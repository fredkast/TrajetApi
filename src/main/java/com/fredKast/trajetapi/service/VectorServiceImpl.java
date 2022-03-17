package com.fredKast.trajetapi.service;

import java.util.List;
import java.util.Optional;

import com.fredKast.trajetapi.dto.mapper.VectorMapper;
import com.fredKast.trajetapi.dto.model.VectorDto;
import com.fredKast.trajetapi.model.Vector;
import com.fredKast.trajetapi.repository.VectorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("vectorService")
public class VectorServiceImpl implements VectorService{
    @Autowired 
    VectorRepository vectorRepository;
    
    @Override
    public Optional<Vector> get(long vectorId) {
        return vectorRepository.findById(vectorId);
    }
    @Override
    public List<Vector> getAll() {
        return vectorRepository.findAll();
    }
    @Override
    public Optional<Vector>  create(VectorDto vectorDto) {
        return Optional.of(vectorRepository.save(VectorMapper.toVector(vectorDto)));
    }
    @Override
    public String delete(long vectorId) {
        vectorRepository.deleteById(vectorId);
        return "Vector deleted with success";
    }
    @Override
    public Optional<Vector> update(Vector existingVectorToUpdate, VectorDto vectorDtoWithUpdate) {
         // -- Update existing user informations
         existingVectorToUpdate.setName(vectorDtoWithUpdate.getName());
 
         // -- Update existing user in DB with new informations
         Optional<Vector> updateVector = Optional.of(vectorRepository.save(existingVectorToUpdate));
 
         return updateVector;
    }
    
}
