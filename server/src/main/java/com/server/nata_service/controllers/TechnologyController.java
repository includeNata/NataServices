package com.server.nata_service.controllers;

import com.server.nata_service.dto.TechnologyDTO;
import com.server.nata_service.entities.Technology;
import com.server.nata_service.services.TechnologyService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/technologie")
public class TechnologyController {

    private final TechnologyService technologyService;

    @Autowired
    public TechnologyController(TechnologyService technologyService) {
        this.technologyService = technologyService;
    }

    @GetMapping
    public ResponseEntity<List<TechnologyDTO>> getAllTechnologies() {
        List<TechnologyDTO> technologies = technologyService.getAllTechnologies();
        return ResponseEntity.ok(technologies);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TechnologyDTO> getTechnologyById(@PathVariable Long id) {
        TechnologyDTO technology = technologyService.getTechnologyById(id);
        return ResponseEntity.ok(technology);
    }

    @PostMapping
    public ResponseEntity<TechnologyDTO> createTechnology(@Valid @RequestBody TechnologyDTO technologyDTO) {
        TechnologyDTO createdTechnology = technologyService.createTechnology(technologyDTO);
        URI uri = URI.create("/technologie/" + createdTechnology.getId());
        return ResponseEntity.created(uri).body(createdTechnology);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TechnologyDTO> updateTechnology(@PathVariable Long id, @Valid @RequestBody TechnologyDTO technologyDTO) {
        TechnologyDTO updatedTechnology = technologyService.updateTechnology(id, technologyDTO);
        return ResponseEntity.ok(updatedTechnology);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTechnology(@PathVariable Long id) {
        technologyService.deleteTechnology(id);
        return ResponseEntity.noContent().build();
    }
}
