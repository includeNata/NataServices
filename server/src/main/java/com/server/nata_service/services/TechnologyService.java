package com.server.nata_service.services;

import com.server.nata_service.entities.Technology;
import com.server.nata_service.repositories.TechnologyRepository;
import com.server.nata_service.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TechnologyService {

    @Autowired
    private TechnologyRepository technologyRepository;

    public Page<Technology> findAll(Pageable pageable) {
        return technologyRepository.findAll(pageable);
    }

    @Transactional
    public Technology findById(Long id) {
        return technologyRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Technology not found"));
    }

    @Transactional
    public Technology create(Technology technology) {
        return technologyRepository.save(technology);
    }

    @Transactional
    public Technology update(Long id, Technology technology) {
        Technology existingTechnology = technologyRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Technology not found"));

        BeanUtils.copyProperties(technology, existingTechnology, "id");

        return technologyRepository.save(existingTechnology);
    }

    @Transactional
    public void delete(Long id) {
        technologyRepository.deleteById(id);
    }
}
