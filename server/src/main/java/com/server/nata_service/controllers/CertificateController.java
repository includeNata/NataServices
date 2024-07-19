package com.server.nata_service.controllers;

import com.server.nata_service.entities.Certificate;
import com.server.nata_service.services.CertificateService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/certificate")
public class CertificateController {

    @Autowired
    private CertificateService certificateService;

    @GetMapping
    public ResponseEntity<Page<Certificate>> findAll(Pageable pageable) {
        return ResponseEntity.ok(certificateService.findAll(pageable));
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Certificate> findById(@PathVariable Long id){
        return ResponseEntity.ok(certificateService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Certificate> create(@Valid @RequestBody Certificate certificate){
        return ResponseEntity.status(HttpStatus.CREATED).body(certificateService.create(certificate));
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Certificate> update(@RequestBody Certificate certificate,@PathVariable Long id){
        return ResponseEntity.ok(certificateService.update(certificate, id));
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        certificateService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
