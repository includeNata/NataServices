package com.server.nata_service.controllers;

import com.server.nata_service.dto.EmployeeDTO;
import com.server.nata_service.entities.Employee;
import com.server.nata_service.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService service;

    @GetMapping
    public ResponseEntity<Page<EmployeeDTO>> findAll(Pageable pageable){
        return ResponseEntity.ok(service.findAll(pageable));
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<EmployeeDTO> findById(@PathVariable Long id){
        return ResponseEntity.ok(service.findById(id));
    }
}
