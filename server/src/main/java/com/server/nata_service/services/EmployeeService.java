package com.server.nata_service.services;

import com.server.nata_service.dto.EmployeeDTO;
import com.server.nata_service.entities.Employee;
import com.server.nata_service.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;
    @Transactional(readOnly = true)
    public EmployeeDTO findById(Long id) {
        Optional<Employee> result = repository.findById(id);
        Employee employee = result.get();
        EmployeeDTO dto = new EmployeeDTO(employee);
        return dto;
    }
}