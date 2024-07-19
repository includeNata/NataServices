package com.server.nata_service.controllers;

import com.server.nata_service.entities.Area;
import com.server.nata_service.services.AreaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/area")
public class AreaController {

    @Autowired
    private AreaService areaService;

    @GetMapping
    public ResponseEntity<Page<Area>> findAll(Pageable pageable) {
        return ResponseEntity.ok(areaService.findAll(pageable));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Area> findById(@PathVariable Long id) {
        return ResponseEntity.ok(areaService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Area> create(@Valid @RequestBody Area area) {
        return ResponseEntity.status(HttpStatus.CREATED).body(areaService.create(area));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Area> update(@Valid @RequestBody Area area, @PathVariable Long id) {
        return ResponseEntity.ok(areaService.update(id, area));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        areaService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
