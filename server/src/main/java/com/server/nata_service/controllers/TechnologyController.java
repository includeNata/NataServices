package com.server.nata_service.controllers;

import com.server.nata_service.entities.Technology;
import com.server.nata_service.services.TechnologyService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/technology")
public class TechnologyController {

    @Autowired
    private TechnologyService technologyService;

    @GetMapping
    public ResponseEntity<Page<Technology>> findAll(Pageable pageable) {
        return ResponseEntity.ok(technologyService.findAll(pageable));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Technology> findById(@PathVariable Long id) {
        return ResponseEntity.ok(technologyService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Technology> create(@Valid @RequestBody Technology technology) {
        return ResponseEntity.status(HttpStatus.CREATED).body(technologyService.create(technology));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Technology> update(@Valid @RequestBody Technology technology, @PathVariable Long id) {
        return ResponseEntity.ok(technologyService.update(id, technology));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        technologyService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
