package com.server.nata_service.controllers;

import com.server.nata_service.dto.SkillDTO;
import com.server.nata_service.services.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/skill")
public class SkillController {

    @Autowired
    private SkillService skillService;

    @GetMapping
    public ResponseEntity<Page<SkillDTO>> findAll(Pageable pageable) {
        return ResponseEntity.ok(skillService.findAll(pageable));
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<SkillDTO> findById(@PathVariable Long id) {
        return ResponseEntity.ok(skillService.findById(id));
    }
    @PostMapping
    public ResponseEntity<SkillDTO> createSkill(@RequestBody SkillDTO skillDTO) {
        SkillDTO createdSkill = skillService.createSkill(skillDTO);
        return ResponseEntity.ok(createdSkill);
    }

    @PutMapping("/{id}")
    public ResponseEntity<SkillDTO> updateSkill(@PathVariable Long id, @RequestBody SkillDTO skillDTO) {
        SkillDTO updatedSkill = skillService.updateSkill(id, skillDTO);
        if (updatedSkill != null) {
            return ResponseEntity.ok(updatedSkill);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
}
