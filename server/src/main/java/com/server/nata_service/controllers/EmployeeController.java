package com.server.nata_service.controllers;

import com.server.nata_service.dto.EmployeeDTO;
import com.server.nata_service.entities.Employee;
import com.server.nata_service.repository.EmployeeRepository;
import com.server.nata_service.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(name = "/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService service;
    @GetMapping(value = "/{id}")
    public EmployeeDTO findById(@PathVariable Long id){
        EmployeeDTO dto = service.findById(id);
        return dto;
    }
}
