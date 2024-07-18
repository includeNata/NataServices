package com.server.nata_service.controllers;

import com.server.nata_service.dto.AreaDTO;
import com.server.nata_service.entities.Area;
import com.server.nata_service.services.AreaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/area")
public class AreaController {

    private final AreaService areaService;

    @Autowired
    public AreaController(AreaService areaService) {
        this.areaService = areaService;
    }

    @GetMapping
    public ResponseEntity<List<AreaDTO>> getAllAreas() {
        List<AreaDTO> areas = areaService.getAllAreas();
        return ResponseEntity.ok(areas);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AreaDTO> getAreaById(@PathVariable Long id) {
        AreaDTO area = areaService.getAreaById(id);
        return ResponseEntity.ok(area);
    }

    @PostMapping
    public ResponseEntity<AreaDTO> createArea(@Valid @RequestBody AreaDTO areaDTO) {
        AreaDTO createdArea = areaService.createArea(areaDTO);
        URI uri = URI.create("/area/" + createdArea.getId());
        return ResponseEntity.created(uri).body(createdArea);
    }

    @PutMapping("/{id}")
    public ResponseEntity<AreaDTO> updateArea(@PathVariable Long id, @Valid @RequestBody AreaDTO areaDTO) {
        AreaDTO updatedArea = areaService.updateArea(id, areaDTO);
        return ResponseEntity.ok(updatedArea);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteArea(@PathVariable Long id) {
        areaService.deleteArea(id);
        return ResponseEntity.noContent().build();
    }
}
