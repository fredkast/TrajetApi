package com.fredKast.trajetapi.controller;

import com.fredKast.trajetapi.dto.model.VectorDto;
import com.fredKast.trajetapi.model.Vector;
import com.fredKast.trajetapi.service.VectorService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

// API request handler for Vectors
@RestController
@RequestMapping("/vectors")
public class VectorController {
    @Resource(name = "vectorService")
    private VectorService vectorService;

    @GetMapping //HTTP request GET + /vectors/
    public List<Vector> getAll() {
        
        return vectorService.getAll();
        
    }

    @GetMapping("/{id}") // HTTP request GET + /vector/id
    public Vector get(@PathVariable long id) {
        return vectorService.get(id).orElseThrow(() -> new RuntimeException("Vector not found : " + id));
    }

    @PostMapping // HTTP request POST + /vectors/
    public Vector create(final @RequestBody VectorDto vector){
        return vectorService.create(vector).orElseThrow(() -> new RuntimeException("Something went wrong, please try later"));
    }

    @PutMapping("/{id}") 
    public Vector update(@PathVariable long id, final @RequestBody VectorDto vectorDtoWithUpdate) {
        Optional<Vector> existingVectorToUpdate = Optional.ofNullable(vectorService.get(id).orElseThrow(() -> new RuntimeException("Vector not found : " + id)));

        return vectorService.update(existingVectorToUpdate.get(), vectorDtoWithUpdate)
                .orElseThrow(() -> new RuntimeException("Something went wrong, please try later"));
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable long id) {
        return vectorService.delete(id);
    }
}
