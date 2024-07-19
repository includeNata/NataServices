package com.server.nata_service.services;

import com.server.nata_service.dto.EmployeeDTO;
import com.server.nata_service.entities.Employee;
import com.server.nata_service.repositories.EmployeeRepository;
import com.server.nata_service.services.exceptions.DatabaseException;
import com.server.nata_service.services.exceptions.ResourceNotFoundException;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Transactional(readOnly = true)
    public Page<EmployeeDTO> findAll(Pageable pageable){
        Page<Employee> employee1 = employeeRepository.findAll(pageable);
        return employee1.map(x -> new EmployeeDTO(x));
    }

    @Transactional(readOnly = true)
    public EmployeeDTO findById(Long id){
        Employee employee1 = employeeRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Recurso nao encontrado"));
        return new EmployeeDTO(employee1);
    }

    @Transactional
    public EmployeeDTO insert(Employee employee){
        employeeRepository.save(employee);
        return new EmployeeDTO(employee);
    }

    @Transactional
    public EmployeeDTO update(Long id, EmployeeDTO dto){
        try {
            Employee entity = employeeRepository.getReferenceById(id);
            copyDtoToEntity(dto, entity);
            entity = employeeRepository.save(entity);
            return new EmployeeDTO(entity);
        }
        catch (EntityNotFoundException e) {
            throw new ResourceNotFoundException("Recurso nao encontrado");
        }

    }

    @Transactional(propagation = Propagation.SUPPORTS)
    public void delete(Long id){
        if (!employeeRepository.existsById(id))
        {
            throw new ResourceNotFoundException("Recurso nao encontrado");
        }
        try {
            employeeRepository.deleteById(id);
        }
        catch (DataIntegrityViolationException e){
            throw new DatabaseException("Referential integrity failure");
        }

    }

    private void copyDtoToEntity(EmployeeDTO dto, Employee entity) {
        entity.setName(dto.getName());
        entity.setEmail(dto.getEmail());
        entity.setPhoto(dto.getPhoto());
        entity.setBirthday(dto.getBirthday());
    }
}
