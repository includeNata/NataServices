package com.server.nata_service.controllers;

import com.server.nata_service.dto.EmployeeDTO;
import com.server.nata_service.entities.Employee;
import com.server.nata_service.repositories.EmployeeRepository;
import com.server.nata_service.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(name = "/employee")
public class EmployeeController {
    @GetMapping
    public ResponseEntity<Object> findAll(){
        return ResponseEntity.ok("test security");
    }
}
